package com.lala.readFileFromCSV

import org.apache.spark.sql._
import org.apache.spark.{SparkConf, SparkContext}


class ReadingCSVFile {

  val conf=new SparkConf().setAppName("Read Csv File").setMaster("local[*]")
  val sc= new SparkContext(conf)
  val sqlContext = new SQLContext(sc)

  def readCSV():DataFrame={

      val readCSVDF=sqlContext.read
        .format("CSV")
        .option("header","true")
        .load("E:\\Learning Spark files\\CSV files\\sampleEmployeeData.csv")


    readCSVDF

  }


}
