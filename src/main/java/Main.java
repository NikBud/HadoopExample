import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.util.List;

public class Main
{
    private static String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws Exception
    {
//        Configuration configuration = new Configuration();
//        configuration.set("dfs.client.use.datanode.hostname", "true");
//        System.setProperty("HADOOP_USER_NAME", "root");
//
//        FileSystem hdfs = FileSystem.get(
//            new URI("hdfs://2caf664ade18:8020"), configuration
//        );
//        Path file = new Path("hdfs://2caf664ade18:8020/test/file.txt");
//
//        if (hdfs.exists(file)) {
//            hdfs.delete(file, true);
//        }
//
//        OutputStream os = hdfs.create(file);
//        BufferedWriter br = new BufferedWriter(
//            new OutputStreamWriter(os, "UTF-8")
//        );
//
//        for(int i = 0; i < 10_000_000; i++) {
//            br.write(getRandomWord() + " ");
//        }
//
//        br.flush();
//        br.close();
//        hdfs.close();


        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 1_000; i++) {
            builder.append(getRandomWord());
        }

        String str = "Java est un langage de programmation orienté objet créé par James Gosling et Patrick Naughton, employés de Sun Microsystems, avec le soutien de Bill Joy (cofondateur de Sun Microsystems en 1982), présenté officiellement le 23 mai 1995 au .SunWorld\n" +
                "\n" +
                "La société Sun a été ensuite rachetée en 2009 par la société Oracle qui détient et maintient désormais Java.\n" +
                "\n" +
                "Une particularité de Java est que les logiciels écrits dans ce langage sont compilés vers une représentation binaire intermédiaire qui peut être exécutée dans une machine virtuelle Java (JVM) en faisant abstraction du système d'exploitation.\n" +
                "\n" +
                "Aperçu\n" +
                "Le langage Java reprend en grande partie la syntaxe du langage C++. Néanmoins, Java a été épuré des concepts les plus subtils du C++ et à la fois les plus déroutants, tels que les pointeurs et références, ou l’héritage multiple contourné par l’implémentation des interfaces. De même, depuis la version 8, l'arrivée des interfaces fonctionnelles introduit l'héritage multiple (sans la gestion des attributs) avec ses avantages et inconvénients tels que l'héritage en diamant. Les concepteurs ont privilégié l’approche orientée objet de sorte qu’en Java, tout est objet à l’exception des types primitifs (nombres entiers, nombres à virgule flottante, etc.) qui ont cependant leurs variantes qui héritent de l'objet Object (Integer, Float...).\n" +
                "\n" +
                "Java permet de développer des applications client-serveur. Côté client, les applets sont à l’origine de la notoriété du langage. C’est surtout côté serveur que Java s’est imposé dans le milieu de l’entreprise grâce aux servlets, le pendant serveur des applets, et plus récemment les JSP (JavaServer Pages) qui peuvent se substituer à PHP, ASP et ASP.NET.\n" +
                "\n" +
                "Java a donné naissance à un système d'exploitation (JavaOS), à des environnements de développement (eclipse/JDK), des machines virtuelles (MSJVM (en), JRE) applicatives multiplateforme (JVM), une déclinaison pour les périphériques mobiles/embarqués (J2ME), une bibliothèque de conception d'interface graphique (AWT/Swing), des applications lourdes (Jude, Oracle SQL Worksheet, etc.), des technologies web (servlets, applets) et une déclinaison pour l'entreprise (J2EE). La portabilité du bytecode Java est assurée par la machine virtuelle Java, et éventuellement par des bibliothèques standard incluses dans un JRE. Cette machine virtuelle peut interpréter le bytecode ou le compiler à la volée en langage machine. La portabilité est dépendante de la qualité de portage des JVM sur chaque OS.\n" +
                "\n" +
                "Historique\n" +
                "Origine du langage\n" +
                "Le langage Java est issu d’un projet de Sun Microsystems datant de 1990 : l’ingénieur Patrick Naughton n’était pas satisfait par le langage C++ utilisé chez Sun, ses interfaces de programmation en langage C, ainsi que les outils associés. Alors qu’il envisageait une migration vers NeXT, on lui proposa de travailler sur une nouvelle technologie et c’est ainsi que le Projet Stealth (furtif) vit le jour.\n" +
                "\n" +
                "Le Projet Stealth fut rapidement rebaptisé Green Project avec l’arrivée de James Gosling et de Mike Sheridan. Ensemble, aidés d’autres ingénieurs, ils commencèrent à travailler dans un bureau de la rue Sand Hill à Menlo Park en Californie. Ils essayèrent d’élaborer une technologie pour le développement d’applications d’une nouvelle génération, offrant à Sun la perspective d’opportunités uniques.\n" +
                "\n" +
                "L’équipe envisageait initialement d’utiliser le langage C++, mais l’abandonna pour différentes raisons. Tout d’abord, ils développaient sur un système embarqué avec des ressources limitées et estimaient que l’utilisation du C++ demandait un investissement trop important et que cette complexité était une source d’erreur pour les développeurs. L'absence de ramasse-miettes impliquait que la gestion de la mémoire devait être programmée manuellement, un défi mais aussi une source d’erreurs.\n" +
                "\n" +
                "L’équipe était également insatisfaite des lacunes du langage C++ au niveau de la sécurité, de la programmation distribuée, du multi-threading. De plus, ils voulaient une plateforme qui puisse être portée sur tout type d’appareils ou de plateformes.\n" +
                "\n" +
                "Bill Joy avait envisagé un nouveau langage combinant le meilleur du langage de programmation Mesa (en) et du langage C. Dans un article appelé Plus loin (Further), il proposa à Sun que ses ingénieurs développent un environnement orienté objet basé sur le langage C++. À l’origine, Gosling envisageait de modifier et d’améliorer le langage C++, qu’il appelait C++ ++ --, mais l’idée fut bientôt abandonnée au profit du développement d’un nouveau langage de programmation qu’ils appelèrent Oak (chêne) en référence, selon la légende, à un arbre planté devant la fenêtre de leur bureau[réf. souhaitée].\n" +
                "\n" +
                "L’équipe travailla avec acharnement[réf. souhaitée] et, à l’été 1992, ils furent capables de faire une démonstration constituée d'une plateforme incluant le système d’exploitation Green[réf. souhaitée], le langage Oak (1992), les bibliothèques et le matériel. Leur première réalisation, présentée le 3 septembre 1992, fut la construction d’un PDA appelé Star7 ayant une interface graphique et un agent intelligent appelé Duke pour prêter assistance à l’utilisateur.\n" +
                "\n" +
                "En novembre de la même année, le Green Project fut abandonné pour devenir FirstPerson, Inc, appartenant en totalité à Sun Microsystems et l’équipe fut relocalisée à Palo Alto. L’équipe FirstPerson était intéressée par la construction d’outils hautement interactifs et quand Time Warner publia un appel d’offres en faveur d’un décodeur multifonctions, FirstPerson changea d’objectif pour proposer une telle plateforme.\n" +
                "\n" +
                "Cependant, l’industrie de la télévision par câble trouva qu’elle offrait trop de possibilités à l’utilisateur et FirstPerson perdit le marché au profit de Silicon Graphics. Incapable d’intéresser l’industrie audiovisuelle, la société fut réintégrée au sein de Sun.\n" +
                "\n" +
                "Java rencontre Internet\n" +
                "\n" +
                "Duke, la mascotte de Java\n" +
                "De juin à juillet 1994, après trois jours de remue-méninges avec John Gage, James Gosling, Joy, Naughton, Wayne Rosing et Eric Schmidt, l’équipe recentra la plateforme sur le web. Ils pensaient qu’avec l’avènement du navigateur Mosaic, Internet était le lieu où allait se développer le même genre d’outil interactif que celui qu’ils avaient envisagé pour l’industrie du câble. Naughton développa comme prototype un petit navigateur web, WebRunner qui deviendra par la suite HotJava.\n" +
                "\n" +
                "La même année le langage fut renommé Java après qu’on eut découvert que le nom Oak était déjà utilisé par un fabricant de carte vidéo.\n" +
                "\n" +
                "Origine du nom Java\n" +
                "Le nom « Java » n'est pas un acronyme, il a été choisi lors d'un brainstorming4 en remplacement du nom d'origine « Oak », à cause d'un conflit avec une marque existante, parce que le café (« java » en argot américain)5 est la boisson favorite de nombreux programmeurs6. Le logo choisi par Sun est d'ailleurs une tasse de café fumant.\n" +
                "\n" +
                "Lancement public de Java\n" +
                "En octobre 1994, HotJava et la plateforme Java furent présentés pour Sun Executives. Java 1.0a fut disponible en téléchargement en 1994 mais la première version publique du navigateur HotJava arriva le 23 mai 1995 à la conférence SunWorld7.\n" +
                "\n" +
                "L’annonce fut effectuée par John Gage, le directeur scientifique de Sun Microsystems. Son annonce fut accompagnée de l’annonce surprise de Marc Andressen, vice-président de l’exécutif de Netscape que Netscape allait inclure le support de Java dans ses navigateurs. Le 9 janvier 1996, le groupe Javasoft fut constitué par Sun Microsystems pour développer cette technologie8. Deux semaines plus tard la première version de Java était disponible.\n" +
                "\n" +
                "Avènement de Java 2\n" +
                "L'apparition de la version 1.2 du langage marque un tournant significatif : c'est en 2000 qu'apparait simultanément la déclinaison en deux plateformes Java :\n" +
                "\n" +
                "Java 2 Standard Edition (J2SE), plateforme avec les API et bibliothèques de bases, devenue depuis Java SE ;\n" +
                "Java 2 Enterprise Edition (J2EE), extension avec des technologies pour le développement d'applications d’entreprise, devenue Java EE.\n" +
                "Sun les qualifie alors de plateforme Java 2 par opposition aux premières générations 1.0 et 1.1. Toutes les versions ultérieures, de J2EE 1.2 à Java SE ou Java EE 7 restent désignées sous le qualificatif de plateformes Java 2, bien que le '2' ait été depuis officiellement abandonné.\n" +
                "\n" +
                "Histoire récente\n" +
                "Utilisation Web\n" +
                "Côté client\n" +
                "Applets\n" +
                "\n" +
                "Historiquement, la possibilité des navigateurs Web de lancer des applets Java était la seule solution pour afficher des applications clientes riches (RIA pour rich Internet application). Puis des technologies concurrentes ont émergé parmi lesquelles Macromedia Flash, le DHTML JavaScript, Silverlight basé sur XAML ou Xul, ou le Scol.\n" +
                "\n" +
                "Les applets sur le poste Client peuvent communiquer avec des servlets sur le Serveur, tout comme Javascript peut communiquer avec le Serveur au moyen d’AJAX. Flex utilise quant à lui la technologie Flash par le biais du Adobe Flash Player.\n" +
                "\n" +
                "À une époque où JavaScript souffrait de problèmes de compatibilité inter-navigateurs, les applets Java avaient l'avantage de la portabilité car le portage d'interfaces complexes était difficile à assurer pour tous les navigateurs du marché.\n" +
                "\n" +
                "Outre la retombée de la « mode » Java, les progrès faits dans les technologies concurrentes à Java ont amené la plupart des développeurs à se détourner des applets Java et des problèmes inhérents à cette technologie (incompatibilités entre les JVM, mauvaises performances, pauvreté des bibliothèques graphiques, complexité). Enfin, les navigateurs modernes n'incluent plus systématiquement l'environnement Java à cause de sa taille importante, et le taux de machines capables d'afficher des applets n'était plus que de 70 % en 2010, bien plus faible que pour Flash par exemple9. En 2010, la quasi-totalité des applications clients riches utilisent des technologies alternatives ; Flash pour l'essentiel mais aussi GWT.\n" +
                "\n" +
                "Enfin, l'arrivée de HTML5, destiné à embarquer de nombreuses fonctionnalités RIA et multimédia, rend également les applets caducs.\n" +
                "\n" +
                "JavaFX\n" +
                "\n" +
                "Avec l'apparition de Java 8 en mars 2014, JavaFX devient l'outil de création d'interface graphique ('GUI toolkit') officiel de Java, pour toutes les sortes d'application (applications mobiles, applications sur poste de travail, applications Web…), le développement de son prédécesseur Swing étant abandonné (sauf pour les corrections de bogues). JavaFX est une pure API Java (le langage de script spécifique qui lui a été un temps associé est maintenant abandonné). JavaFX contient des outils très divers, notamment pour les médias audio et vidéo, le graphisme 2D et 3D, la programmation Web, la programmation parallèle, etc.\n" +
                "\n" +
                "Côté serveur\n" +
                "Avec les serveurs d’applications, on utilise des EJB pour encapsuler les classes définies précédemment. Ces éléments sont utilisés dans des architectures J2EE pour des applications multicouches. L'avantage qu'on tire de ce travail est de pouvoir cacher au client l'implémentation du code côté serveur.\n" +
                "\n" +
                "Utilisation sur poste de travail\n" +
                "L’utilisation native du langage Java pour des applications sur un poste de travail restait jusqu'à présent relativement rare à cause de leur manque de rapidité. Cependant, avec l’accroissement rapide de la puissance des ordinateurs, les améliorations au cours des années 2000, de la machine virtuelle Java et de la qualité des compilateurs, plusieurs technologies ont gagné du terrain comme NetBeans et l’environnement Eclipse, les technologies de fichiers partagés LimeWire, Vuze (ex Azureus), et I2P. Java est aussi utilisé dans le programme de mathématiques MATLAB, au niveau de l’interface homme machine et pour le calcul formel. Les applications Swing apparaissent également comme une alternative à la technologie .NET.\n" +
                "\n" +
                "Utilisation avec les mobiles\n" +
                "\n" +
                "Android utilise beaucoup les technologies Java\n" +
                "Oracle annonce début octobre 2012 à la conférence JavaOne sa volonté de proposer des solutions Java pour le domaine des logiciels embarqués, pour processeurs moins puissants que ceux habituellement disponibles sur les PC. Oracle fédère autour d'elle tout un écosystème d'entreprises spécialistes de ces segments de marchés, comme l'éditeur MicroEJ10 ou encore STMicroelectronics qui propose du Java sur ses STM3211 dont le cœur est un CortexM3/M4.\n" +
                "\n" +
                "Java, notamment via Eclipse et NetBeans, offre déjà des environnements de développement intégrés pour mobile. Java est le principal langage utilisé pour développer des applications pour le système d'exploitation libre pour Mobile de Google : Android.\n" +
                "\n" +
                "JavaFX peut aussi permettre l'utilisation de Java sur mobiles, bien que ce ne soit pas son objectif principal.\n" +
                "\n" +
                "OS Windows, Mac OS X et GNU/Linux\n" +
                "Microsoft a fourni en 2001 un environnement de travail de type Java, dénommé J++, avec ses systèmes d’exploitation avant la sortie de Windows XP. À la suite d'une décision de justice[réf. nécessaire], et au vu du non-respect des spécifications de ce langage, Microsoft a dû abandonner celui-ci et créer un nouveau langage, de nom C# (cf. chapitre « Indépendance vis-à-vis de la plateforme » plus bas)\n" +
                "\n" +
                "Beaucoup de fabricants d’ordinateurs continuent d’inclure un environnement JRE sur leurs systèmes Windows.\n" +
                "\n" +
                "Java apparaît également comme un standard au niveau du Mac OS X d’Apple aussi bien que pour les distributions Linux. Ainsi, de nos jours, la plupart des utilisateurs peuvent lancer des applications Java sans aucun problème. Toutefois, sur ordinateur Apple, la distribution de Java 5 à Java 6 fut assurée directement par Apple, et non par Oracle12. Cette politique entraîna des retards et des restrictions de version :\n" +
                "\n" +
                "Ainsi J2SE 1.4 ne fut pas disponible avant Mac OS X v10.2 (nom de code Jaguar), J2SE 5.0 à partir de Mac OS X v10.4 (Tiger), Java SE 6 fonctionne uniquement sous Mac OS X v10.5 (Leopard) équipé de processeur Intel13, et Java 7 exige un ordinateur Mac Intel exécutant la version Mac OS X v10.7.3 (Lion).\n" +
                "Passage sous licence open-source\n" +
                "Le 11 novembre 2006, le code source du compilateur javac et de la machine virtuelle HotSpot ont été publiés en Open Source sous la Licence publique générale GNU14.\n" +
                "\n" +
                "Le 13 novembre 2006, Sun Microsystems annonce le passage de Java, c’est-à-dire le JDK (JRE et outils de développement) et les environnements Java EE (déjà sous licence CDDL) et Java ME sous licence GPL d’ici mars 2007, sous le nom de projet OpenJDK15.\n" +
                "\n" +
                "En mai 2007, Sun publie effectivement OpenJDK sous licence libre. Cependant OpenJDK dépend encore de fragments de code non libre que Sun ne détient pas. C'est pourquoi la société Redhat lance en juin 2007 le projet IcedTea (en) qui vise à remplacer les fragments de code non libre et ainsi rendre OpenJDK utilisable sans aucun logiciel propriétaire. En juin 2008, le projet IcedTea a passé les tests rigoureux de compatibilité Java (TCK)16. IcedTea est donc une implémentation open-source des spécifications de Java. Sun, puis Oracle, garde toutefois le contrôle de la technologie par le biais d'un catalogue de brevets s'appliquant à Java, ainsi que par le maintien du TCK sous une licence propriétaire.\n" +
                "\n" +
                "Acquisition par Oracle\n" +
                "La société Oracle a acquis en 2009 l'entreprise Sun Microsystems. On peut désormais voir apparaître le logo Oracle dans les documentations de l'api Java.\n" +
                "\n" +
                "Le 12 avril 2010, James Gosling, le créateur du langage de programmation Java, démissionne d’Oracle pour des motifs qu’il ne souhaite pas divulguer. Il était devenu le directeur technologique de la division logicielle client pour Oracle.\n" +
                "\n" +
                "En 2018, Oracle annonce que les mises à jour de sa version Java SE 8 pour un usage professionnel seraient soumis à une licence payante à partir de janvier 201917.\n" +
                "\n" +
                "Historique des versions\n" +
                "Le langage Java a connu plusieurs évolutions depuis le JDK 1.0 (Java Development Kit) avec l’ajout de nombreuses classes et packages à la bibliothèque standard. Depuis le J2SE1.4, l’évolution de Java est dirigée par le JCP (Java Community Process) qui utilise les JSR (Java Specifications Requests) pour proposer des ajouts et des changements sur la plateforme Java. Le langage lui-même est spécifié par le JLS (Java Language Specification), les modifications du JLS étant gérées sous le code JSR 90118.\n" +
                "\n" +
                "Il faut noter que les évolutions successives du langage ne portent guère sur sa syntaxe -relativement stable depuis le début- mais principalement sur l'enrichissement de ses fonctions, avec l'embarquement et l'optimisation de bibliothèques logicielles (API) dans des domaines très variés de l'informatique : bases de données, gestion XML, informatique distribuée et web, multimédia, sécurité…\n" +
                "\n" +
                "Numérotation des versions\n" +
                "Il faut distinguer la version du langage Java de celles des plateformes et du JRE :\n" +
                "\n" +
                "Le numéro majeur de version du langage (par exemple Java 5) spécifiée par le JLS, est ainsi le numéro mineur pour le JRE ou la plateforme (par ex JRE 1.5 ou Java SE 1.5)19 ;\n" +
                "Le JRE et la plateforme Java SE sont eux identifiés depuis Java 5 par un même numéro de version : ainsi Java SE 1.6.0.43, et le JRE 1.6.0.43, sont tous deux conformes au langage Java 6, mais ont fait l'objet notamment de correctifs de sécurité20 ;\n" +
                "Java FX (orienté RIA), constitué essentiellement d'un sous-ensemble de JavaSE, suit également le même numéro de version : Java FX en est ainsi sa version 2.7 pour 1.721(également compatible JRE 1.6) ;\n" +
                "En revanche, les plateformes Enterprise Edition (Java EE) et Mobile Edition (Java ME) sont identifiées par le numéro de version de leur propre SDK ; ainsi début 2013 :\n" +
                "Java EE en était encore à la version 6 (Java EE 6 SDK Update 4), mais fonctionnait avec les JDK 6 ou 722; il n'est réellement passé à Java 7 que mi-juin 201323,\n" +
                "Java ME en est à sa version 3.3 (SDK v. 3.3)24.\n" +
                "Versions successives\n" +
                "Deux versions peuvent parfois être proposées simultanément, telles que 8u65 & 8u66 : la différence consiste généralement en des corrections de bugs mineurs (sans incidence de sécurité notamment), pour lesquelles la mise à jour à la toute dernière version n'est pas critique et est de ce fait laissée au choix des administrateurs (JRE) ou développeurs (JDK).\n" +
                "\n" +
                "Les versions publiques de Java peuvent être suivies de versions non publiques, dites Advanced, réservées à des usages commerciaux ; ainsi Java 1.6u45 est la dernière version publique de Java6, mais 6u113 l'ultime version disponible fin mars 2016.\n" +
                "\n" +
                "En date du 07/09/2022, les versions LTS (pour Long Time Support) actuelles sont JAVA 7, 8, 11 & 1725.\n" +
                "\n" +
                "Version\tDernière version\tDénomination JSE/JRE\tNom de code\tSpécifications\tJDK\tStatut octobre 2018\tPériode de maintenance\tSupport étendu26\n" +
                "1.0\t1.0.2\tJava 1.0\tOak\tJSR 52\tJDK 1.0.2\tN'est plus soutenu de façon active\t1996-2000\t\n" +
                "1.1\t8_16\tJava 1.1\t\tJSR 52\t1.1.8_16\tN'est plus soutenu de façon active\t1997-2000\t\n" +
                "1.2\t2_017\tJ2SE 1.2\tPlayground\tJSR 52\t1.2.2_11\tN'est plus soutenu de façon active\t2000-2006\t\n" +
                "1.3\t1_29\tJ2SE 1.3\tKestrel\tJSR 58\t1.3.1_29\tObsolète\t2000-2001\t\n" +
                "1.4\t2_30\tJ2SE 1.4\tMerlin\tJSR 59\t1.4.2_30\tObsolète\t2000-200827\t\n" +
                "1.5\t0_22 à 0_85\tJ2SE 5.0\tTiger\tJSR 176\t1.5.0_22\tObsolète, 5u51 à 5u85 uniquement disponibles avec un support Oracle spécifique28\t2002-200927\tMai 2015\n" +
                "1.6\t0_45 à 0_111\tJava SE 6\tMustang\tJSR 270\t6u113\tObsolète, 6u51 à 6u111 uniquement disponibles avec un support Oracle spécifique28\t2005-201327\tDécembre 2018\n" +
                "1.7\t0_79 à 0_80\tJava SE 7\tDolphin\tJSR 336\t1.7.0_79\tStable, version 1.7.0_7929\t2011- 201527\tJuillet 2022\n" +
                "1.8\t0_171\tJava SE 8\tKenai30 puis Spider\tJSR 337\t1.8.0_171\tStable, version 1.8.0_17131 proposée aux utilisateurs32\tMars 2022\tDécembre 2030\n" +
                "9\t9.0.4\tJava SE 9\tUmbrella\tJSR 37933\t9.0.4\tStable\t2018-?\t\n" +
                "10\t10.0.2\tJava SE 10\t\tJSR 383\t10.0.2\tsupporté 6 mois avant prochaine sortie du JDK Java11-LTS\t2018, pas une version LTS (long term support)\t\n" +
                "11\t11.0.13\tJava SE 11\t\tJSR 384\t11.0.13+10\tversion LTS\tSeptembre 2023\tSeptembre 2026\n" +
                "12\t12.0.2\tJava SE 12\t\tJSR 386\t12.0.2\t\t\t\n" +
                "13\t13.0.2\tJava SE 13\t\tJSR 388\t13.0.2\t\t\t\n" +
                "14\t14.0.2\tJava SE 14\t\tJSR 389\t14.0.2\t\t\t\n" +
                "15\t15.0.2\tJava SE 15\t\tJSR 390\t15.0.2\t\t\t\n" +
                "16\t16.0.2\tJava SE 16\t\tJSR 391\t16.0.2\t\t\t\n" +
                "17\t17.0.1+12\tJava SE 17\t\tJSR 392\t17.0.1\tversion LTS\tSeptembre 2026\tSeptembre 2029\n" +
                "Seules les derniers numéros de versions de chaque release sont listées ici. Le détail des modifications successives par version et par update figure sur wikipedia.en/java_history.\n" +
                "\n" +
                "Contenu et évolutions\n" +
                "Du JDK 1.0 au J2SE 1.4\n" +
                "JDK 1.0 (23 janvier 1996 - 211 classes et interfaces) — Version initiale34.\n" +
                "JDK 1.1 (19 février 1997 - 477 classes et interfaces) — De nombreux ajouts35 avec notamment :\n" +
                "une refonte complète du modèle événementiel AWT ;\n" +
                "les classes internes sont ajoutées au langage ;\n" +
                "JavaBeans ;\n" +
                "JDBC ;\n" +
                "Java Remote Invocation (RMI).\n" +
                "J2SE 1.2 (9 décembre 1998 - 1 524 classes et interfaces) — Nom de code Playground. Cette version et les suivantes jusque J2SE 7.0 sont rebaptisées Java 2 et la version nommée J2SE (Java 2 Platform, Standard Edition) remplace JDK pour distinguer la plateforme de base de la version J2EE (Java 2 Platform, Enterprise Edition) et de la version J2ME (Java 2 Platform, Micro Edition). Plusieurs ajouts36 dont :\n" +
                "le mot-clé strictfp (strict floating-point : virgule flottante stricte) ;\n" +
                "la réflexion ;\n" +
                "l’API graphique Swing est intégrée ;\n" +
                "pour la première fois, la machine virtuelle Java de Sun inclut un compilateur « Compilation à la volée » (Just in Time) ;\n" +
                "Java Plug-in ;\n" +
                "Java IDL, une implémentation de IDL pour l’interopérabilité avec CORBA ;\n" +
                "le framework Collections.\n" +
                "J2SE 1.3 (8 mai 2000 - 1 840 classes et interfaces) — Nom de code Kestrel. Changements principaux37 :\n" +
                "HotSpot JVM inclus (La machine virtuelle HotSpot sortit en avril 1999 pour la machine virtuelle du J2SE 1.2) ;\n" +
                "changement pour les RMI pour être basé sur CORBA ;\n" +
                "JavaSound ;\n" +
                "JNDI (Java Naming and Directory Interface) inclus de base (disponible auparavant comme extension) ;\n" +
                "JPDA (Java Platform Debugger Architecture).\n" +
                "J2SE 1.4 (6 février 2002 - 2 723 classes et interfaces) — Nom de code Merlin. Ce fut la première révision de la plateforme sous JCP (Java Community Process)38. Les principaux changements39 sont :\n" +
                "le mot-clé assert (Spécifié dans JSR 4140) ;\n" +
                "les expressions rationnelles modélisées en s’inspirant du langage Perl ;\n" +
                "le chaînage d’exception permet à une exception d’encapsuler l’exception de bas niveau d’origine. (Spécifié dans (en) JSR 51 [archive]) ;\n" +
                "API de journalisation (Spécifiée dans (en) JSR 47 [archive]) ;\n" +
                "l’API Image I/O pour lire et écrire des images dans des formats comme JPEG et PNG ;\n" +
                "l'intégration d’un parser XML et du moteur XSLT nommé JAXP (Spécifié dans (en) JSR 5 [archive] et (en) JSR 63 [archive]) ;\n" +
                "l'intégration des extensions de sécurité JCE (Java Cryptography Extension (en)), JSSE et JAAS ;\n" +
                "Java Web Start (introduit pour la première fois en mars 2001 pour J2SE 1.3 - Spécifié dans (en) JSR 56 [archive]).\n" +
                "J2SE 5.0\n" +
                "Sortie le 30 septembre 2004 (3 270 classes et interfaces), son nom de code est Tiger. Elle est initialement numérotée 1.5, qui est toujours utilisé comme numéro de version interne41. Développé par (en) JSR 176 [archive], Tiger ajoute un nombre significatif de nouveautés42 au langage :\n" +
                "\n" +
                "intégration du composant logiciel Java Web Start dans l'environnement d'exécution Java (JRE)43 ;\n" +
                "programmation générique — (Spécifié par (en) JSR 14 [archive]) ;\n" +
                "metadata — également appelées annotations, permet au langage de construire des classes et des méthodes étiquetées avec des données additionnelles qui peuvent être utilisées en tant que méta-données (Spécifiée dans (en) JSR 175 [archive]) ;\n" +
                "autoboxing/unboxing — conversion automatique entre des types primitifs (comme le type int) et le Wrapper de classe correspondant (comme la classe Integer) (Spécifié dans (en) JSR 201 [archive]) ;\n" +
                "énumérations — le mot-clé enum permet de créer une liste ordonnée de valeurs en gardant la sûreté du typage. Auparavant, ceci pouvait seulement être réalisé par des entiers constants (Spécifié dans JSR 201) ;\n" +
                "varargs — la syntaxe Object… utilisée dans une déclaration de méthode permet de spécifier un nombre variable d’arguments pour cette méthode. C’est un fonctionnement équivalent à la fonction « printf » en C ;\n" +
                "imports statiques — Cette fonctionnalité permet d’utiliser les constantes d’une classe sans spécifier le nom de cette classe et sans passer par « l’anti-pattern Constant Interface » (c’est l’expression utilisée sur le site de Sun) ;\n" +
                "extension du for pour les boucles — la syntaxe du for est étendue avec une syntaxe spéciale pour itérer sur n’importe quel objet itérable comme un tableau, ou une collection en utilisant la syntaxe :\n" +
                "        void displayWidgets (Iterable<Widget> widgets) {\n" +
                "            for (Widget w : widgets) {\n" +
                "                w.display();\n" +
                "            }\n" +
                "        }\n" +
                "Cet exemple parcourt le contenu de l’objet widgets de la classe Iterable et contenant uniquement des références vers des objets de la classe Widget, assignant chacun de ces éléments à la variable w et ensuite appelle la méthode display() sur l’élément w (spécifié dans JSR 201). Une syntaxe similaire sera introduite en 2011 dans C++11.\n" +
                "\n" +
                "En plus des changements au niveau du langage, des changements plus importants ont eu lieu au fil des années qui ont conduit des quelques centaines de classes dans le JDK 1.0 à plus de 3 000 dans J2SE 5.0. Des API entières, comme Swing ou Java2D, ont été ajoutées et beaucoup de méthodes de l’original JDK 1.0 ont été déclarées deprecated (c’est-à-dire déconseillées, elles pourraient être supprimées dans une version ultérieure de Java).\n" +
                "\n" +
                "Java SE 6\n" +
                "Sortie le 11 décembre 2006 (3 777 classes et interfaces dans plus de 20 paquetages), son nom de code est Mustang [archive]44. Une version bêta est sortie le 15 février 2006, une autre bêta en juin 2006, une version « release candidate » en novembre 2006, et la version finale le 12 décembre 2006. Avec cette version, Sun remplace définitivement le nom J2SE par Java SE et supprime le .0 au numéro de version45.\n" +
                "\n" +
                "Cette version a été l'objet de nombreuses failles de sécurité et leurs mises à jour correctives, conduisant à la version 1.6.0_45 par Oracle et même 1.6.0_51 pour sa version Mac OS. C'est d'ailleurs là la dernière version de Java fonctionnant pour Mac OS X 10.6 et antérieurs.\n" +
                "\n" +
                "Java SE 7 (LTS)\n" +
                "Sortie le 7 juillet 2011 (8 00046 classes et interfaces), son nom de code est Dolphin. Il s’agit de la première version sous la licence GNU GPL.\n" +
                "\n" +
                "Dès l'update 6 (7u6), l'édition standard Oracle de Java supportant de nouveau pleinement Mac OS X47, les mises à jour pour cet OS ne sont plus prises en charge par Apple mais par Oracle. Toutefois cette version de Java n'est pas supportée par Mac OS X v10.6 : En effet certaines API requises par Java 7 ont bien été incluses par Apple dans Mac OS X 10.7.3, mais il n'est pas prévu qu'elles soient implémentées sur les précédentes versions de Mac OS48. La version 7u90 d'avril 2015 est la dernière mise à jour de Java 7 disponible publiquement49.\n" +
                "\n" +
                "Java 7 propose entre autres les nouveautés suivantes :\n" +
                "\n" +
                "la notation binaire ;\n" +
                "le formatage numérique pour plus de lisibilité ;\n" +
                "les switch avec des string ;\n" +
                "l'inférence des types à la création d'instance pour éviter une redondance de syntaxe (cf. List<String> lst = new ArrayList<>();) ;\n" +
                "le multicatch permettant de concaténer les exceptions catchées via des | ;\n" +
                "java.nio (JSR 203) qui propose notamment une nouvelle interface Path, un système de parcours des répertoires, un service de watch…\n" +
                "les tasks pour paralléliser les calculs jugés trop lourd ou trop coûteux ;\n" +
                "l'autoboxing d'objets vers les types primitifs ;\n" +
                "interface utilisateur : transparence des frames, bordures arrondies, gestion des évènements asynchrones via les secondary loops, les JLayers, les Painters, le nouveau style Nimbus…\n" +
                "Java SE 8 (LTS)\n" +
                "Nom de code Kenaï. Diverses releases en cours de développement du JDK sont disponibles au téléchargement dès l'automne 201350, et Java 8 sort mi-mars 2014 conformément à une feuille de route présentée par Oracle dès mai 201351.\n" +
                "\n" +
                "Une des nouveautés majeures de cette version est l’ajout des lambdas52, entraînant une refonte d'une partie de l'API, notamment les collections et la notion de stream. Les autres ajouts notables incluent les optionnels, les implémentations par défaut au sein d'une interface, une refonte de l'API date, etc. En revanche la version Enterprise Edition (Java 8 EE) n'est pas attendue avant 2017.\n" +
                "\n" +
                "La modularisation de la JVM avec le projet Jigsaw, initialement prévue pour cette version, est quant à elle reportée à la version 953, du fait notamment des failles de sécurité rencontrées par Java 6 dont Oracle a privilégié la correction en 2013 par rapport aux évolutions de Java.\n" +
                "\n" +
                "Java SE 9\n" +
                "Initialement prévue pour 2015 mais reportée en partie à cause du projet Jigsaw, cette version est finalement sortie le 21 septembre 201754.\n" +
                "\n" +
                "Java 9 intègre :\n" +
                "\n" +
                "le projet Jigsaw permettant de modulariser les modules chargés au sein du JDK ;\n" +
                "JShell55, le projet Kulla visant la création d'un shell pour Java sur le format read–eval–print loop (en) ;\n" +
                "le projet Valhalla visant une amélioration des types Java ;\n" +
                "un support natif de HTTP/256Cf Release Note Oracle57. Il faut utiliser des librairies pour JSON58.\n" +
                "Java SE 10\n" +
                "Cette version est sortie le 20 mars 201859.\n" +
                "\n" +
                "Cette nouvelle version intègre notamment :\n" +
                "\n" +
                "JEP 28660 : inférence des types des variables locales;\n" +
                "JEP 31061 : partage de binaire pour permettre un lancement plus rapide\n" +
                "JEP 31762 : activation de Graal un compilateur JIT en Java\n" +
                "Java SE 11 (LTS)\n" +
                "Cette version est sortie le 25 septembre 201863.\n" +
                "\n" +
                "Au-delà du changement du modèle de support à long terme des versions, cette version intègre notamment :\n" +
                "\n" +
                "JEP 323 : amélioration sur les paramètres des lambda\n" +
                "JEP 321 : un client HTTP plus évolué\n" +
                "JEP 320 : suppression des modules CORBA et EE par défaut\n" +
                "Java SE 12\n" +
                "Cette version est sortie le 19 mars 201964.\n" +
                "\n" +
                "Cette version intègre 8 évolutions :\n" +
                "\n" +
                "JEP 189 : Shenandoah, un ramasse miette avec de courte pauses (Expérimentale)\n" +
                "JEP 230 : suite d'outils de microbenchmark pour le code source du JDK\n" +
                "JEP 325 : expressions Switch (aperçu)\n" +
                "JEP 334 : API Constants, permettant d'ajouter des informations dans les métadonnées dans les fichiers .class, utile pour les langages sur la JVM)\n" +
                "JEP 340 : un seul portage pour l'architecture ARM 64bits\n" +
                "JEP 341 : Default CDS Archives, chargement des informations des classes de la JVM plus rapide\n" +
                "JEP 344 et JEP 346 : améliorations du ramasse miette G1\n" +
                "Java SE 13\n" +
                "Cette version est sortie le 17 septembre 201965.\n" +
                "\n" +
                "JEP 355 : Text Blocks\n" +
                "JEP 354 : (Switch - aperçu v2) Nouveau case case...-> (case traditionnel case...:)\n" +
                "switch(nombre){\n" +
                "    //case traditionnel\n" +
                "    case 5:\n" +
                "        System.out.println(\"La variable est égale à 5\");\n" +
                "        break;\n" +
                "        \n" +
                "    //nouveau case\n" +
                "    case 5 -> System.out.println(\"La variable est égale à 5\");\n" +
                "}\n" +
                "Java SE 14\n" +
                "Cette version est sortie le 17 mars 202066\n" +
                "\n" +
                "JEP 343 : Incubator\n" +
                "JEP 358 : Plus de précision de la part du compilateur sur les erreurs NullPointerExceptions\n" +
                "JEP 361 : (Switch - version finale) Nouveau case case...-> (case traditionnel case...:)67\n" +
                "JEP 362 : Dépréciation des ports Solaris et SPARC\n" +
                "JEP 368 : Text Blocks\n" +
                "Java SE 15\n" +
                "Cette version est sortie le 15 septembre 202068.\n" +
                "\n" +
                "? Pas de JEP ?\n" +
                "\n" +
                "Java SE 16\n" +
                "Cette version est sortie le 16 mars 202169.\n" +
                "\n" +
                "? Pas de JEP ?\n" +
                "\n" +
                "Java SE 17 (LTS)\n" +
                "Cette version est sortie le 14 septembre 202170.\n" +
                "\n" +
                "JEP 306 : Restauration de la sémantique stricte permanente pour la virgule flottante\n" +
                "JEP 356 : Générateur amélioré de nombre pseudo-aléatoire\n" +
                "JEP 382 : Nouveau pipeline de rendu macOS\n" +
                "JEP 391 : Portage macOS AArch64\n" +
                "JEP 398 : Dépréciation pour suppression de l'API Applet\n" +
                "JEP 403 : Encapsulation forte des internes du JDK\n" +
                "JEP 406 : Filtrage par motif (Pattern Matching) pour switch (préversion)\n" +
                "JEP 407 : Suppression de l'activation de RMI\n" +
                "JEP 409 : Classes scellées\n" +
                "JEP 410 : Suppression du compilateur expérimental AOT et JIT\n" +
                "JEP 411 : Dépréciation pour suppression du gestionnaire de sécurité\n" +
                "JEP 412 : API de fonction étrangère et de mémoire (incubation)\n" +
                "JEP 414 : API vectorielle (deuxième incubation)\n" +
                "JEP 415 : Filtres de désérialisation spécifiques au contexte\n" +
                "Java SE 18\n" +
                "Cette version est sortie le 22 mars 202271.\n" +
                "\n" +
                "? Pas de JEP ?\n" +
                "\n" +
                "Java SE 19\n" +
                "On peut estimer que cette version arrivera en septembre 2022.\n" +
                "\n" +
                "Côté OpenJDK, elle est en cours de développement72.\n" +
                "\n" +
                "Java SE 20\n" +
                "On peut estimer que cette version arrivera en mars 2023.\n" +
                "\n" +
                "Côté OpenJDK, elle est en cours de développement72.\n" +
                "\n" +
                "Philosophie\n" +
                "Lors de la création du langage Java, il avait été décidé que ce langage devait répondre à cinq objectifs73 :\n" +
                "\n" +
                "simple, orienté objet et familier ;\n" +
                "robuste et sûr ;\n" +
                "indépendant de la machine employée pour l'exécution ;\n" +
                "très performant ;\n" +
                "compilé, multi-tâches et dynamique.\n" +
                "Langage orienté objet et familier\n" +
                "Article connexe : Programmation orientée objet.\n" +
                "La première caractéristique, le caractère orienté objet (« OO ») et familier, fait référence à une méthode de programmation et de conception du langage et le fait qu'un programme écrit en Java ressemble assez fort à un programme écrit en C++.\n" +
                "\n" +
                "Bien qu’il existe plusieurs interprétations de l’expression orienté objet, une idée phare dans ce type de développement est que les différents types de données doivent être directement associés avec les différentes opérations qu’on peut effectuer sur ces données. En conséquence, les données (appelées Propriétés) et le code les manipulant (appelé Méthodes) sont combinés dans une même entité appelée Classe d'objet. Le code devient logiquement découpé en petites entités cohérentes et devient ainsi plus simple à maintenir et plus facilement réutilisable, étant intrinsèquement modulaire.\n" +
                "\n" +
                "D’autres mécanismes tels que l’héritage permettent d’exploiter toutes les caractéristiques d’une Classe précédemment écrite dans ses propres programmes sans même avoir à en connaître le fonctionnement interne — on n’en voit que l’interface (l'interface décrit les propriétés et les méthodes sans fournir le code associé). Java interdit la notion d'héritage depuis plusieurs classes parent sauf si elles sont des interfaces.\n" +
                "\n" +
                "Dans la version 1.5 du langage ont été rajoutés les génériques, un mécanisme de polymorphisme similaire (mais différent) aux templates du langage C++ ou aux foncteurs d’OCaml. Les génériques permettent d’exprimer d’une façon plus simple et plus sûre (du point de vue du typage) les propriétés d’objets comme des conteneurs (listes, arbres…) : le type liste est alors considéré génériquement par rapport au type d’objet contenu dans la liste.\n" +
                "\n" +
                "Mécanisme du ramasse-miettes\n" +
                "Article connexe : Ramasse-miettes en informatique.\n" +
                "Cet élément contribue à la robustesse et à la performance des programmes, le ramasse-miettes (Garbage Collector) est appelé régulièrement et automatiquement pendant l'exécution du programme. Sur les systèmes multi-processeurs et/ou multi-cœurs, celui-ci emploie même des threads multiples à faible priorité afin de perturber le moins possible l'exécution du programme74. En outre, le programmeur peut au besoin suggérer de lancer le ramasse-miettes à l’aide de la méthode System.gc().\n" +
                "\n" +
                "Un grief récurrent à l’encontre de langages comme C++ est la lourde tâche d’avoir à programmer manuellement la gestion de la mémoire. En C++, la mémoire allouée par le programme pour créer un objet est désallouée lors de la destruction de celui-ci (par exemple par un appel explicite à l'opérateur delete). Si le programmeur oublie de coder la désallocation, ceci aboutit à une « fuite mémoire », et le programme en consomme de plus en plus. Pire encore, si par erreur un programme demande plusieurs fois une désallocation, ou emploie une zone de mémoire après avoir demandé sa désallocation, celui-ci deviendra très probablement instable et causera une erreur fatale.\n" +
                "\n" +
                "En Java, une grande partie de ces problèmes est évitée grâce au ramasse-miettes. L'espace mémoire nécessaire à chaque objet créé est géré dans un tas de mémoire (en anglais : memory heap) réservé à cet usage. Le programme accéde à chaque objet via une référence dans le tas. Quand il n'existe plus aucune référence permettant d'atteindre un objet, le ramasse-miettes le détruit automatiquement — puisqu'il est devenu inaccessible — libérant la mémoire et prévenant ainsi toute fuite de mémoire.\n" +
                "\n" +
                "Le ramasse-miettes emploie un algorithme de marquage puis libération (en anglais : mark and sweep74) qui permet de gérer les cas complexes d'objets se référençant mutuellement ou de boucles de références (cas d'une liste à chaînage double par exemple). En pratique, il subsiste des cas d'erreur de programmation où le ramasse-miettes considère qu'un objet est encore utile alors que le programme n'y accède plus fonctionnellement (mais garde une référence sur l'objet), ce qui constitue un cas particulier de « fuite mémoire ».\n" +
                "\n" +
                "Le ramasse-miettes rend sensiblement plus simple et plus sûre la gestion de la mémoire. Les concepteurs et les utilisateurs de programmes ou bibliothèques (en anglais Libraries) n'ont pas à se soucier de la désallocation des objets (opérateur delete en C++), sauf éventuellement pour des raisons de performance.\n" +
                "\n" +
                "Indépendance vis-à-vis de la plateforme\n" +
                "Articles connexes : Bytecode Java et Compilation à la volée.\n" +
                "L’indépendance vis-à-vis de la plateforme signifie que les programmes écrits en Java fonctionnent de manière parfaitement similaire sur différentes architectures matérielles. La licence de Sun pour Java insiste ainsi sur le fait que toutes les implémentations doivent être compatibles. On peut ainsi théoriquement effectuer le développement sur une architecture donnée et faire tourner l’application finale sur toutes les autres.\n" +
                "\n" +
                "Ce résultat est obtenu par :\n" +
                "\n" +
                "des bibliothèques standard fournies pour pouvoir accéder à certains éléments de la machine hôte (le graphisme, le multithreading, la programmation réseau…) exactement de la même manière sur toutes les architectures ;\n" +
                "des compilateurs Java qui compilent le code source « à moitié » afin d’obtenir un bytecode (plus précisément le bytecode Java, un langage de type assembleur, proche de la machine virtuelle et spécifique à la plateforme Java).\n" +
                "Ce bytecode a ensuite vocation à être interprété sur une machine virtuelle Java (JVM en anglais), un programme écrit spécifiquement pour la machine cible qui interprète le bytecode Java et fait exécuter par la machine les instructions traduites en code natif.\n" +
                "Noter que même s’il y a explicitement une première phase de compilation, le bytecode Java est soit interprété, soit converti à la volée en code natif par un compilateur à la volée (just in time, JIT).\n" +
                "\n" +
                "Types de compilations\n" +
                "Les premières implémentations du langage utilisaient une machine virtuelle interprétée pour obtenir la portabilité. Ces implémentations produisaient des programmes qui s’exécutaient plus lentement que ceux écrits en langage compilé (C, C++, etc.) si bien que le langage souffrit d’une réputation de faibles performances.\n" +
                "\n" +
                "Des implémentations plus récentes de la machine virtuelle Java (JVM) produisent des programmes beaucoup plus rapides qu’auparavant, en utilisant différentes techniques :\n" +
                "\n" +
                "La première technique est de compiler directement en code natif comme un compilateur traditionnel, supprimant complètement la phase de bytecode. Des compilateurs Java tels que GNU Compiler for Java (GCJ) compilent ainsi directement le Java en code objet natif pour la machine cible. On obtient ainsi de bonnes performances, mais aux dépens de la portabilité : le code final produit par ces compilateurs ne peut de ce fait être exécuté que sur une seule architecture ;\n" +
                "Une autre technique appelée compilation « juste-à-temps », ou « à la volée » (just in time, JIT), traduit le byte code en code natif durant la phase de lancement du programme ;\n" +
                "Certaines machines virtuelles plus sophistiquées utilisent une recompilation dynamique durant laquelle la machine virtuelle analyse le comportement du programme et en recompile sélectivement certaines parties. La recompilation dynamique permet d’obtenir de meilleurs résultats que la compilation statique car les compilateurs dynamiques peuvent optimiser en fonction de leur connaissance de l’environnement cible et des classes qui sont utilisées.\n" +
                "La compilation JIT et la recompilation dynamique permettent à Java de tirer profit de la rapidité du code natif sans perdre la portabilité.\n" +
                "Bilan de la portabilité Java\n" +
                "Après que Sun eut constaté que l’implémentation de Microsoft ne supportait pas les interfaces RMI et JNI, et comportait des éléments spécifiques à certaines plateformes par rapport à sa plateforme initiale, Sun déposa plainte en justice contre Microsoft75, et obtint des dommages et intérêts (20 millions de dollars). Cet acte de justice renforça encore les termes de la licence de Sun. En réponse, Microsoft arrêta le support de Java sur ses plateformes et, sur les versions récentes de Windows, Internet Explorer ne supporte pas les applets Java sans ajouter de plug-in. Cependant, Sun met à disposition gratuitement des environnements d’exécution de Java pour les différentes plateformes Microsoft.\n" +
                "\n" +
                "La portabilité est techniquement un objectif difficile à atteindre et le succès de Java en ce domaine est mitigé. Quoiqu’il soit effectivement possible d’écrire des programmes pour la plateforme Java qui fonctionnent correctement sur beaucoup de machines cibles, le nombre important de plateformes avec de petites erreurs et des incohérences a abouti à un détournement du slogan de Sun « Write once, run anywhere » (« Écrire une fois, exécuter n'importe où ») en « Write once, debug everywhere » (« Écrire une fois, déboguer partout ») !\n" +
                "\n" +
                "L’indépendance de Java vis-à-vis de la plateforme est cependant un succès avec les applications côté serveur comme les services web, les servlets et le Java Beans aussi bien que les systèmes embarqués sur OSGi, utilisant l’environnement Embedded Java.\n" +
                "\n" +
                "Exécution sécurisée de code distant\n" +
                "La plateforme Java fut l’un des premiers systèmes à offrir le support de l’exécution du code à partir de sources distantes. Une applet peut fonctionner dans le navigateur web d’un utilisateur, exécutant du code téléchargé d’un serveur HTTP. Le code d’une applet fonctionne dans un espace très restrictif, ce qui protège l’utilisateur des codes erronés ou mal intentionnés. Cet espace est délimité par un objet appelé gestionnaire de sécurité. Un tel objet existe aussi pour du code local, mais il est alors par défaut inactif.\n" +
                "\n" +
                "Le gestionnaire de sécurité (la classe SecurityManager) permet de définir un certain nombre d’autorisations d’utilisation des ressources du système local (système de fichiers, réseau, propriétés système…). Une autorisation définit :\n" +
                "\n" +
                "Un code accesseur (typiquement, une applet — éventuellement signée — envoyée depuis un serveur web) ;\n" +
                "Une ressource locale concernée (par exemple un répertoire) ;\n" +
                "Un ensemble de droits (par exemple lire/écrire).\n" +
                "Les éditeurs d’applet peuvent demander un certificat pour leur permettre de signer numériquement une applet comme sûre, leur donnant ainsi potentiellement (moyennant l’autorisation adéquate) la permission de sortir de l’espace restrictif et d’accéder aux ressources du système local.\n" +
                "\n" +
                "Éléments du langage\n" +
                "Voici un exemple d’un programme Hello world typique écrit en Java :\n" +
                "\n" +
                " public class HelloWorld {\n" +
                "     public static void main(String[] args) {\n" +
                "         System.out.println(\"Hello world!\");\n" +
                "     }\n" +
                " }\n" +
                "Le fichier source porte presque toujours le nom de la classe avec l'extension « .java » (ici « HelloWorld.java », ce serait même obligatoire car la classe possède l'attribut public dans sa déclaration — la rendant alors accessible à tout autre programme). On peut compiler puis exécuter cet exemple sur le terminal avec les commandes suivantes (sous Linux) :\n" +
                "\n" +
                "javac HelloWorld.java\n" +
                "export CLASSPATH=.\n" +
                "java HelloWorld\n" +
                "La ligne « export CLASSPATH=. » sert à indiquer à Java qu’il doit également chercher les programmes class dans le répertoire courant. Ce chemin peut également être spécifié au lancement du programme par l’option -classpath (ou -cp en abrégé) :\n" +
                "\n" +
                "java -cp. HelloWorld\n" +
                "Mots réservés, primitifs et littéraux\n" +
                "abstract else instanceof static try boolean false\n" +
                "assert (1.4) enum (5.0) interface strictfp (1.2) volatile byte true\n" +
                "break extends native super while char\n" +
                "case final new switch double\n" +
                "catch finally package synchronized float\n" +
                "class for private this int\n" +
                "const (*) goto (*) protected throw long\n" +
                "continue if public throws short\n" +
                "default implements return transient void null\n" +
                "do import\n" +
                "Notes :\n" +
                "\n" +
                "(*) ces mots clefs sont réservés mais n'ont pas de signification pour le compilateur (il est juste interdit d'employer ce nom pour une variable par exemple) ;\n" +
                "(1.2), (1.4) et (5.0) ces mots clefs ont été ajoutés avec la version indiquée du langage.\n" +
                "(source [archive])\n" +
                "\n" +
                "Classe, attribut, méthode\n" +
                "Notion de classe\n" +
                "Une classe est la description de données appelées attributs, et d’opérations appelées méthodes. Il s'agit d'un modèle de définition pour des objets ayant le même ensemble d’attributs, et le même ensemble d’opérations. À partir d’une classe on peut créer un ou plusieurs objets par instanciation ; chaque objet est une instance d’une seule classe.\n" +
                "\n" +
                "Visibilité :\n" +
                "\n" +
                "Public : le mot class est alors précédé de public, tout utilisateur qui importe le paquetage peut utiliser la classe. Dans ce cas elle doit être définie dans un fichier qui a pour nom le nom de la classe.\n" +
                "Privé : le mot class est alors précédé de private, seules des classes définies dans le même fichier peuvent utiliser cette classe.\n" +
                "Paquetage : le mot class n’est pas précédé de mot particulier, toutes les classes du paquetage peuvent utiliser la classe.\n" +
                "Notion d'attribut\n" +
                "Un attribut se définit en donnant son type, puis son nom, et éventuellement une partie initialisation.\n" +
                "\n" +
                "Visibilité :\n" +
                "\n" +
                "Public : sa définition est précédée de public, et il peut être utilisé par tout utilisateur de la classe.\n" +
                "Privé : sa définition est précédée de private, et il ne peut être utilisé qu’à l’intérieur de la classe.\n" +
                "Protégé : sa définition est précédée de protected, et il ne peut être utilisé qu’à l’intérieur de la classe, du paquetage, ou des classes dérivées.\n" +
                "Paquetage : aucun mot particulier ne précède sa définition, ainsi il peut être utilisé dans toute classe du même paquetage.\n" +
                "Notion de méthode\n" +
                "Une méthode est définie par :\n" +
                "\n" +
                "son type de retour : type de la valeur retournée par la méthode. Si la méthode ne retourne pas de valeur le type spécifié est alors void ;\n" +
                "son nom ;\n" +
                "ses paramètres : les paramètres sont spécifiés par leur type et leur nom et sont séparés par des virgules.\n" +
                "Visibilité :\n" +
                "\n" +
                "Public : sa définition est précédée de public, et elle peut être utilisée par tout utilisateur de la classe.\n" +
                "Privé : sa définition est précédée de private, et elle ne peut être utilisée qu’à l’intérieur de la classe.\n" +
                "Protégé : sa définition est précédée de protected, et elle ne peut être utilisée qu’à l’intérieur de la classe, du paquetage, ou des classes dérivées.\n" +
                "Paquetage : aucun mot particulier ne précède sa définition, ainsi la méthode peut être utilisé dans toute classe du même paquetage.\n" +
                "Types\n" +
                "Nom\tTaille en octets lors des calculs\tValeur par défaut\tValeurs possibles\n" +
                "boolean\tUn seul bit suffit, mais on réserve souvent un octet pour les stocker.\tfalse\ttrue, false\n" +
                "byte\t1\t0\tentiers compris entre -128 et +127 (-27 et 27-1)\n" +
                "short\t2\t0\tentiers compris entre −32 768 et 32 767 (-215 et 215-1)\n" +
                "int\t4\t0\tentiers compris entre −2 147 483 648 et +2 147 483 647 (-231 et 231-1)\n" +
                "long\t8\t0\tentiers compris entre −9 223 372 036 854 775 808 et 9 223 372 036 854 775 807 (-263 et 263-1)\n" +
                "char\t2\t'\\u0000'\tEnsemble des valeurs Unicode (valeurs de U+0000 à U+FFFF, 4 chiffres obligatoires après '\\u') Les 128 premiers caractères sont les codes ASCII et se notent entre apostrophes : 'a', '1', '\\'', '\\n'.\n" +
                "float\t4\t0.0\tEnsemble des nombres [−3,402 823 47 × 1038 .. −1,402 398 46 × 10−45], 0, [1,402 398 46 × 10−45 .. 3,402 823 47 × 1038]\n" +
                "double\t8\t0.0\tEnsemble des nombres [−1,797 693 134 862 315 70 × 10308 .. −4,940 656 458 412 465 44 × 10−324], 0, [4,940 656 458 412 465 44 × 10−324 .. 1,797 693 134 862 315 70 × 10308]\n" +
                "Object\tDépendant de la machine virtuelle\tnull\n" +
                "Le tableau ci-dessus recense les types de base, cependant il existe en Java d'autres types qui sont des objets et sont à utiliser en tant que tel. Par exemple pour définir un entier on peut utiliser le type 'Integer' dont la valeur d'initialisation par défaut vaudra null\n" +
                "\n" +
                "Pour instancier une variable, la syntaxe (ici la même qu'en C) est la suivante :\n" +
                "\n" +
                "NomDuType maVariable;\n" +
                "maVariable est alors allouée sur la pile.\n" +
                "\n" +
                "Les collections d'objets\n" +
                "Il est souvent nécessaire de stocker de nombreuses données dans des collections : liste d’achats, notes des élèves, etc. Les collections peuvent être consultées, modifiées, on peut les trier, les recopier, les supprimer, etc. Elles peuvent avoir une taille fixe ou variable.\n" +
                "\n" +
                "Les collections à taille fixe sont moins lourdes que les collections à taille variable.\n" +
                "\n" +
                "Collections de taille fixe\n" +
                "Les tableaux :\n" +
                "Comme en C, les indices d'un tableau de taille n vont de 0 à n-1. Un des plus grands avantages des tableaux est l’accès en temps constant O(1), à chaque case du tableau.\n" +
                "Les tableaux sont des objets en Java. Pour initialiser un tableau tab d’entiers de 10 cases, on peut écrire (entre autres) :\n";
        FileAccess access = new FileAccess("hdfs://55f2461f7591:8020");
        access.appendOrCreate("hdfs://55f2461f7591:8020/test/text.txt", str);
    }

    private static String getRandomWord()
    {
        StringBuilder builder = new StringBuilder();
        int length = 2 + (int) Math.round(10 * Math.random());
        int symbolsCount = symbols.length();
        for(int i = 0; i < length; i++) {
            builder.append(symbols.charAt((int) (symbolsCount * Math.random())));
        }
        return builder.toString();
    }
}
