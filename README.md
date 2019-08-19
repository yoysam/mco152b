jDiskMark is a disk io benchmarking utility written in java, kindly made public by jamesmarkchan  in https://sourceforge.net/projects/jdiskmark/  and protected under BSD License and Apache License V2.0.  See that repository for more detailed readme about functionality

It is not (yet) particularly object oriented, nor is it (yet) particularly extendible, no coincidence there :-)
 
== Usage ==

1. Requires java 8. If using JDK 10 or newer, obtain EclipseLink version 2.7.3 jar, place it in lib directory (rename to eclipselink.jar)

2. to run outside of IDE:
   Unix         $ java -jar jDiskMark.jar
   On windows double click executable jar file.


Note that the jdm.properties file gets updated when the program is executed, the locationDir property gets set to the users home directory if not set already. If it is set and its wrong, execution of a benchmark will fail.


For MCO152 class, this repo's master branch is updated to this level:


level 1 - Cleaned up some warnings and added sample Javadoc (branches cleanWarings, docExamples), added meaningful gitignore.

level 0 - taken from jamesmarkchan repo at V0.4
