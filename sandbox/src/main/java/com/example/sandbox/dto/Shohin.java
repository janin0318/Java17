package com.example.sandbox.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class Shohin {
  private String shohinId;
  private String shohinMei;
  private String shohinBunrui;
  private Integer hanbaiTanka;
  private Integer shiireTanka;
  private Timestamp torokubi;
}
