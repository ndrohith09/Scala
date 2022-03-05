object Checksum {
   def calcChecksum(s: String): Int = {
    val cc = new ChecksumCalculator
    for (c <- s) {
      cc.add(c.toByte)
    }
    cc.checksum
  }
}
class ChecksumCalculator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum: Int = (sum & 0xFF) + 1
}
object Main
{
  def main(args: Array[String])
  {

    val cs= Checksum.calcChecksum("scala is fun")
    println(cs)

  }
}