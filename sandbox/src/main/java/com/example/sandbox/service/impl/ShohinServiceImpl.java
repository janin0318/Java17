package com.example.sandbox.service.impl;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.mapper.ShohinMapper;
import com.example.sandbox.service.ShohinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShohinServiceImpl implements ShohinService {
  
  private final ShohinMapper shohinMapper;
  
  @Autowired
  public ShohinServiceImpl(ShohinMapper shohinMapper) {
    this.shohinMapper = shohinMapper;
  }
  
  /**
   * 商品テーブルからすべてのレコードを取得する。
   *
   * @return すべての商品レコード
   */
  @Override
  public List<Shohin> getAllShohin() {
    return shohinMapper.findAll();
  }
  
  /**
   * 商品IDから商品情報を取得する。
   *
   * @param shohinId 商品ID
   * @return 商品レコード
   */
  @Override
  public Shohin getShohinDetail(String shohinId) {
    return shohinMapper.findByShohinId(shohinId);
  }
  
  /**
   * すべての商品名を取得する。
   *
   * @return すべての商品名が入っているList
   */
  @Override
  public List<String> getAllShohinMei() {
    List<Shohin> shohinList = shohinMapper.findAll();
    return shohinList.stream().map(Shohin::getShohinMei).toList();
  }
  
  /**
   * 商品テーブルにレコードを登録する
   *
   * @param shohin 登録する商品
   */
  @Override
  public int registerShohin(Shohin shohin) {
    return shohinMapper.insertShohin(shohin);
  }
}
