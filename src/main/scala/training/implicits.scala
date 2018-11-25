package training

import training.datatypes._
import training.instances._
import training.typeclasses._

object implicits {

  implicit def intCombinator: Combinator[Int] = new IntCombinator

  implicit def maybeCombinator[A](implicit CA: Combinator[A]): Combinator[Maybe[A]] = new MaybeCombinator[A]


  //Syntax

  implicit class CombinatorSyntax[A](self: Maybe[A]) {
    def combine(other: Maybe[A])(implicit ev: Combinator[Maybe[A]]): Maybe[A] = ev.combine(self, other)
  }

}
