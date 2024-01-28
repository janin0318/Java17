package com.example.sandbox.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class Shohin {
  
  private String shohinId;
  
  @NotBlank
  private String shohinMei;
  
  @NotBlank
  private String shohinBunrui;
  
  @NotNull
  @Max(Integer.MAX_VALUE)
  private Integer hanbaiTanka;
  
  @NotNull
  @Max(Integer.MAX_VALUE)
  private Integer shiireTanka;
  
  private Timestamp torokubi;
}
