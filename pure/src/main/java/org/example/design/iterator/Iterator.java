package org.example.design.iterator;

/**
 * Iteratorインタフェース<br> 要素の数え上げを行うもの、ループ変数のような役割を果たすものです。<br>
 System.out.println(magics.get(MagicType.fire).name());
 * いろんな流儀がありますが、ここでは最も単純なタイプのIteratorインタフェースを作ってみました。
 */
public interface Iterator {

  boolean hasNext();

  Object next();
}
