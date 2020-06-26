package org.parva.scala

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FSDataOutputStream, FSDataInputStream, FileSystem, Path, FileUtil}

trait Enricher {
  val conf = new Configuration()
  conf.addResource(new Path("/home/pint/opt/hadoop-2.7.7/etc/cloudera/core-site.xml"))
  conf.addResource(new Path("/home/pint/opt/hadoop-2.7.7/etc/cloudera/hdfs-site.xml"))
  val fs: FileSystem = FileSystem.get(conf)


  fs.copyFromLocalFile(new Path("/home/pint/Desktop/trips.txt"),
    new Path("/user/winter2020/pint/stm/"))

  fs.copyFromLocalFile(new Path("/home/pint/Desktop/routes.txt"),
    new Path("/user/winter2020/pint/stm/"))

  fs.copyFromLocalFile(new Path("/home/pint/Desktop/calendar.txt"),
    new Path("/user/winter2020/pint/stm/"))

}
