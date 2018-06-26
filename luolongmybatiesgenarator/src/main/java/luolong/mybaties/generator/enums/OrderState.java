package luolong.mybaties.generator.enums;

/**
 * <p></p>
 * @author luolong
 * @date 2018/6/26
 */
public enum OrderState implements CodeBaseEnum {
    INIT(0,"初始"),
    SUCCESS(1,"成功"),
    ERROR(2,"错误"),
    FAIL(3,"失败"),
    PROGRESSING(4,"进行中");

    private int code;
    private String desc;

    OrderState(int code ,String desc){
        this.code  = code;
        this.desc = desc;
    }

    public int code() {
        return code;
    }
}
