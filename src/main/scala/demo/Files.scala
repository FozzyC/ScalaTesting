import java.io.{BufferedReader, File}

package demo {

  import java.io.FileReader

  class FilesCF {

    def ReadFile(input: String): Unit = {
      val f = new File(input)
      if (f.canRead) {
        val fi = new FileReader(input)

        while (fi.ready()) {
          val l = fi.read().toChar //is there a better method than read? one that reads a whole line?
          print(l)
        }
      }
    }

    def ReadFile2(input: String): Unit = {
      val fi = new FileReader(input)
      val bf = new BufferedReader(fi)

      while(bf.ready()){
        println(bf.readLine())
      }
    }


  }

}
