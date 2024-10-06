// Example of an application

// Spark context
val sc = new SparkContext("spark://localhost:7077", "Spark App", "/usr/local/spark", List("target/scala-2.10/spark_2.10-1.0.jar"))
// val sc = new SparkContext("location of the spark master", "Spark App", "location of the spark home", List("location of the jar file"))

// RDD
val file = sc.textFile("sample.txt")   // Read the file

// Transformation
val errors = file.filter(_.contains("ERROR"))   // Filter the lines that contain "ERROR"

// Action
errors.cache()   // Cache the filtered lines

// Action
errors.count()   // Count the number of lines



/////////////////////////
// Example of RDD creation from data
val data=List(1,2,3,4,5,6)
val rdd=sc.parallelize(data)
val sq=rdd.map(x=>x*x)
sq.collect()
sq.reduce((x,y)=>x+y)

// Example of RDD creation from a file
val mydata = sc.textFile("sample.txt")
mydata.count()


/////////////////////////
// Transformations - map and filter
val rdd=sc.textFile("rmvdb.18445")
rdd.cache()
rdd.count()

val rdd=sc.textFile("*")
rdd.count()

val rd2=rdd.filter(line=>line.contains("INRW"))
rd2.count()


