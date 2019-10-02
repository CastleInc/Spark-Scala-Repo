package com.lala.readFileFromDB

import org.apache.spark
import org.apache.spark.SparkContext
import org.apache.spark.sql.{DataFrame, SQLContext}

class ReadingDbData {

    val conf=new spark.conf.setAppName("Reading from DB").setMaster("local[*]")
    val sc =new SparkContext(conf)
    val sqlContext=new SQLContext(sc)

  def readFromDb():DataFrame={


  }
}
