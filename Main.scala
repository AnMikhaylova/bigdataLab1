//9. Выведите все слова заданного текста с одинаковыми
//первой и последней буквами.

def filterWords(text: String): List[String] = {
  text.split("\\W+")
    .filter(word => word.nonEmpty && word.head.toLower == word.last.toLower)
    .toList
}

@main def Main() = {
  val s: String = "The only way to learnl a new programming language isi by writing programs in it"

  val words = filterWords(s)
  println(words)
}