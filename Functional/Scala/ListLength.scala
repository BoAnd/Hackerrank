def f(arr: List[Int]): Int = arr match {
    case Nil => 0
    case _ :: rest => 1 + f(rest)
}
