package main;

/**
 * Title: 替换空格
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-07-12 00:10
 */
public class 替换空格 {
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toString().toCharArray()) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();

    }
}