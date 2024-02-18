package org.example.design.iterator;

/**
 * Aggregate(アグリゲート)インタフェース<br> 数え上げをおこなうものの「集合体」を表します。<br>
 * このインタフェースを実装しているクラスは、配列のように「なにかたくさん集まっているもの」になります。<br>
 * aggregateという英単語は「集める」「集まる」「集合」という意味です。
 */
public interface Aggregate {

  public Iterator iterator();

}
