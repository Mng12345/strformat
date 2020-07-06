package strformat;

/**
 * @Author zhangming
 * @Date 2019/11/12 16:11
 */
public class StrFormatter {

    private StrFormatter() {}

    private StringBuilder stringBuilder = new StringBuilder();

    public static StrFormatter str() {
        return new StrFormatter();
    }

    public StrFormatter i(Object object) {
        this.stringBuilder.append(object);
        return this;
    }

    public static String format(String )

    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }

}
