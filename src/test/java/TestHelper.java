import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestHelper {

    /**
     * 把long 转换成 日期 再转换成String类型
     */
    public static String transferLongToDate(String dateFormat, Long millSec) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date date = new Date(millSec);
        return sdf.format(date);
    }

    public static String formatDuring(long mss) {
        long days = mss / (1000 * 60 * 60 * 24);
        long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);
        long seconds = (mss % (1000 * 60)) / 1000;
        return days + " days " + hours + " hours " + minutes + " minutes "
                + seconds + " seconds ";
    }


    // 打印ascii码表
    public static String outputSpecialChar(int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            sb.append((char) (count + i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String d = transferLongToDate("yyyy-MM-dd HH:mm:ss", 1318521600000L);
        System.out.println(d);

        System.out.println(outputSpecialChar(0));

    }
}
