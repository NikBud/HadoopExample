import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class FileAccess
{

    private final Configuration configuration = new Configuration();
    private final FileSystem hdfs;
    Path file;


    /**
     * Initializes the class, using rootPath as "/" directory
     *
     * @param rootPath - the path to the root of HDFS,
     * for example, hdfs://localhost:32771
     */
    public FileAccess(String rootPath) throws URISyntaxException, IOException {
        configuration.set("dfs.client.use.datanode.hostname", "true");
        configuration.set("dfs.client.block.write.replace-datanode-on-failure.enable", "false");
        configuration.setBoolean("dfs.support.append", true);
        System.setProperty("HADOOP_USER_NAME", "root");

        hdfs = FileSystem.get(
                new URI(rootPath), configuration
        );
    }

    /**
     * Creates empty file or directory
     *
     * @param path
     */
    public boolean create(String path) throws IOException {
        file = new Path(path);

        if (hdfs.exists(file)) {
            hdfs.delete(file, true);
        }

        OutputStream os = hdfs.create(file);
        BufferedWriter br = new BufferedWriter(
                new OutputStreamWriter(os, "UTF-8")
        );

        if (hdfs.exists(file)) return true;


        br.flush();
        br.close();

        return false;
    }

    /**
     * Appends content to the file
     *
     * @param path
     * @param content
     */
    public void appendOrCreate(String path, String content) throws IOException, FileNotFoundInHDFSExceptions {
        file = new Path(path);

        if(hdfs.exists(file)){
            FSDataOutputStream fs_append = hdfs.append(file);
            PrintWriter writer = new PrintWriter(fs_append);
            writer.append(content);
            writer.flush();
            fs_append.hflush();
            writer.close();
            fs_append.close();

        }
        else {
            FSDataOutputStream fs_create = hdfs.create(file);
            PrintWriter writer = new PrintWriter(fs_create);
            writer.write(content);
            writer.flush();
            fs_create.hflush();
            writer.close();
            fs_create.close();
        }

    }


    public void append(String path, String content) throws IOException, FileNotFoundInHDFSExceptions {
        file = new Path(path);

        if(hdfs.exists(file)){
            FSDataOutputStream fs_append = hdfs.append(file);
            PrintWriter writer = new PrintWriter(fs_append);
            writer.append(content);
            writer.flush();
            fs_append.hflush();
            writer.close();
            fs_append.close();

//===================== ВТОРОЙ СПОСОБ ==========================
//            OutputStream os = hdfs.append(file);
//            BufferedWriter br = new BufferedWriter(
//                    new OutputStreamWriter(os, "UTF-8")
//            );
//            br.write(content);
//            br.flush();
//            br.close();
        }
        else {
            throw new FileNotFoundInHDFSExceptions("File not found in system(");
        }

    }

    /**
     * Returns content of the file
     *
     * @param path
     * @return
     */
    public String read(String path) throws IOException, FileNotFoundInHDFSExceptions {
        file = new Path(path);
        if(hdfs.exists(file)) {
            file = new Path(path);
            FSDataInputStream inputStream = hdfs.open(file);
            String out = IOUtils.toString(inputStream, "UTF-8");
            inputStream.close();
            return out;
        }
        else throw new FileNotFoundInHDFSExceptions("Sorry, this file doesn't exists (");
    }

    /**
     * Deletes file or directory
     *
     * @param path
     */
    public boolean delete(String path) throws IOException, FileNotFoundInHDFSExceptions {
        file = new Path(path);
        if(hdfs.exists(file)){
            boolean result = hdfs.delete(file, true);
            if(result) return result;
        }
        else
        {
            throw new FileNotFoundInHDFSExceptions("Sorry, this file doesn't exists (");
        }
        return false;
    }

    /**
     * Checks, is the "path" is directory or file
     *
     * @param path
     * @return
     */
    public boolean isDirectory(String path) throws IOException {
        return hdfs.isDirectory(new Path(path));
    }

    /**
     * Return the list of files and subdirectories on any directory
     *
     * @param path
     * @return
     */
    public List<String> list(String path) throws IOException, FileNotFoundInHDFSExceptions {
        List<String> list = new ArrayList<>();
        file = new Path(path);
        if(hdfs.exists(file)) {
            FileStatus[] statuses = hdfs.listStatus(file);

            for (FileStatus status : statuses) {
                String[] parts = status.getPath().toString().split("/");
                if (status.isDirectory()) {
                    list.add("Subdirectory: " + "/" + parts[parts.length - 2] + "/" + parts[parts.length - 1]);
                } else {
                    list.add("File: " + "/" + parts[parts.length - 2] + "/" + parts[parts.length - 1]);
                }
            }

            return list;
        }
        else throw new FileNotFoundInHDFSExceptions("Sorry, this file doesn't exists (");

    }
}
