# XToast
自定义吐司

# LogRecordHelper


# 功能描述：

将Logcat日志存储到手机文件中

-------------------------------------------------------------------

## Glide:
```
null
```


## Maven:
```
null
```
<br><br>
# 使用方法：

 ### // 纯文字
 XToastHelper.getInstance()
             .setTxtColor(getResources().getColor(R.color.colorAccent))
             .setTxtSize(18)
             .setDuration(Toast.LENGTH_SHORT)
             .setBgColor(Color.parseColor("#2222ff"))
             .showXToast(this,"这是提示文字" );
 
 ---------
 
### // 图标+文字
 
  XToastHelper.getInstance()
              .showXToast(this,"这是提示文字" , R.mipmap.icon_about);
 
  ---------


