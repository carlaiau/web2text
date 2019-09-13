import ch.ethz.dalab.web2text.ExtractPageFeatures._
import java.io.File
object CarlsExtractFeatures {

    def main(args: Array[String]): Unit = {

        val docs = getListOfFiles("/home/caiau/School/processing/individuals/a")

        var counter = 0
        for(doc <- docs.slice(0,500)){
            val fileName = doc.toString().split("/").last
            
            try{
                extractPageFeatures(doc.toString(), "/home/caiau/School/data/web2textRelated/features/a/" + fileName)
                println(counter + ": " + doc + "Completed! ")
            } catch{
                case e: Exception => println("Error!")
            }
            counter += 1
        }

    }

    def getListOfFiles(dir: String):List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
        d.listFiles.filter(_.isFile).toList
    } else {
        List[File]()
    }
}
}