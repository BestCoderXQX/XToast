package acffo.xqx.xtoast_lib;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author xqx
 * @email djlxqx@163.com
 * blog:http://www.cnblogs.com/xqxacm/
 * createAt $date$
 * description:
 */
public class XToastHelper {

    public static XToastHelper instance;
    public static Toast xToast ;

    public static int txtColor = Color.parseColor("#ffffff"); // 文本颜色
    public static int txtSize = 14; // 文本大小
    public static int bgColor = Color.parseColor("#88888888"); // 背景颜色
    public static int toastBg = R.drawable.background_toast;  // 背景框
    public static int duration = Toast.LENGTH_SHORT;        // 吐司显示时间

    public static XToastHelper getInstance(){
        if (instance == null){
            instance = new XToastHelper();
        }
        // 初始化部分变量
        bgColor = Color.parseColor("#88888888");
        txtColor = Color.parseColor("#ffffff");
        txtSize = 14;
        toastBg = R.drawable.background_toast;
        duration = Toast.LENGTH_SHORT;
        return instance ;
    }

    public Toast getxToast(Context context){
        if (xToast == null){
            xToast = Toast.makeText(context , "" ,Toast.LENGTH_SHORT);
        }
        return xToast;
    }




    /**
     * 显示纯文本提示
     * @param context
     * @param msg
     */
    public void showXToast(Context context , String msg ){
        Toast toast = getxToast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.default_toast, null, false);
        TextView txtContent = (TextView) layout.findViewById(R.id.txtContent);
        LinearLayout root = (LinearLayout) layout.findViewById(R.id.root);
        GradientDrawable gradientDrawable = (GradientDrawable) context.getResources().getDrawable(R.drawable.background_toast);
        gradientDrawable.setColor(bgColor);
        root.setBackgroundDrawable(gradientDrawable);
        txtContent.setText(msg);                          // 设置文字
        txtContent.setTextSize(TypedValue.COMPLEX_UNIT_SP , txtSize); // 设置文字大小
        txtContent.setTextColor(txtColor);                // 设置文字颜色
        toast.setDuration(duration);
        toast.setView(layout);
        toast.setDuration(duration);
        toast.show();
    }


    /**
     * 显示纯文本提示
     * @param context
     * @param msg
     */
    public void showXToast(Context context , String msg ,int img ){
        Toast toast = getxToast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.default_toast_img, null, false);
        TextView txtContent = (TextView) layout.findViewById(R.id.txtContent);
        ImageView imgView = (ImageView) layout.findViewById(R.id.img);
        LinearLayout root = (LinearLayout) layout.findViewById(R.id.root);
        GradientDrawable gradientDrawable = (GradientDrawable) context.getResources().getDrawable(R.drawable.background_toast);
        gradientDrawable.setColor(bgColor);
        root.setBackgroundDrawable(gradientDrawable);
        imgView.setImageResource(img);
        txtContent.setText(msg);                          // 设置文字
        txtContent.setTextSize(TypedValue.COMPLEX_UNIT_SP , txtSize); // 设置文字大小
        txtContent.setTextColor(txtColor);                // 设置文字颜色
        toast.setDuration(duration);
        toast.setView(layout);
        toast.setDuration(duration);
        toast.show();
    }


    public XToastHelper setTxtColor(int txtColor) {
        XToastHelper.txtColor = txtColor;
        return instance;
    }


    public XToastHelper setTxtSize(int txtSize) {
        XToastHelper.txtSize = txtSize;
        return instance;
    }

    public XToastHelper setDuration(int duration) {
        XToastHelper.duration = duration;
        return instance;
    }

    public XToastHelper setBgColor(int bgColor) {
        XToastHelper.bgColor = bgColor;
        return instance;
    }
}
