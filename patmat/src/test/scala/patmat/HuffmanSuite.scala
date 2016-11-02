package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
  trait TestTrees {
    val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
    val t2 = Fork(Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5), Leaf('d', 4), List('a', 'b', 'd'), 9)
  }
  
    test("weight of a larger tree") {
      new TestTrees {
        assert(weight(t1) === 5)
      }
    }
  
    test("chars of a larger tree") {
      new TestTrees {
        assert(chars(t2) === List('a', 'b', 'd'))
      }
    }
  
    test("times of an unique char in a char List") {
      val chars = string2Chars("abcabbde")
      val results = List(('a', 2), ('b', 3), ('c', 1), ('d', 1), ('e', 1))
      new TestTrees {
        val result = times(chars)
        assert(result.length == 5)
        assert(result(0)._2 == 2)
        assert(result(1)._2 == 3)
        assert(result(2)._2 == 1)
        assert(result(3)._2 == 1)
        assert(result(4)._2 == 1)
      }
    }
  
    test("string2chars(\"hello, world\")") {
      assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
    }
  
    test("makeOrderedLeafList for some frequency table") {
      assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 3)))
    }
  
    test("singleton checks a list of code trees contains only one single tree") {
      val sampleTree1 = List[CodeTree](makeCodeTree(makeCodeTree(Leaf('a', 1), Leaf('b', 1)), Leaf('c', 2)))
      val sampleTree2 = sampleTree1 :+ makeCodeTree(makeCodeTree(Leaf('d', 1), Leaf('e', 1)), Leaf('f', 2))
  
      assert(singleton(List[CodeTree]()) == false)
      assert(singleton(sampleTree1) == true)
      assert(singleton(sampleTree2) == false)
    }
  
    test("combine of some leaf list") {
      val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
      assert(combine(leaflist) === List(Fork(Leaf('e', 1), Leaf('t', 2), List('e', 't'), 3), Leaf('x', 4)))
    }

  test("decode and encode a very short text should be identity") {
    new TestTrees {
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
    }
  }

    test("Quick Code") {
      println(decodedSecret)
    }
}
