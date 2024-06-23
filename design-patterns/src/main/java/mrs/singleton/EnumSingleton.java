package mrs.singleton;

/**
 * Enumを使用したSingletonパターン
 * <p>
 * Enumは定数セットを表すためだけでなく、それぞれの定数がインスタンである性質を持つ。
 */
public enum EnumSingleton {

  INSTANCE;

  private String key;
  private String value;

  public static EnumSingleton getInstance() {
    if (INSTANCE.key == null) {
      INSTANCE.key = "key";
    }
    if (INSTANCE.value == null) {
      INSTANCE.value = "value";
    }
    return INSTANCE;
  }

  public String getKey() {
    return INSTANCE.key;
  }

  public void setKey(String key) {
    INSTANCE.key = key;
  }

  public String getValue() {
    return INSTANCE.value;
  }

  public void setValue(String value) {
    INSTANCE.value = value;
  }
}
