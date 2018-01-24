# XToast
自定义吐司

# LogRecordHelper


# 功能描述：

自定义Toast
可编辑点：
1、文字大小
2、文字颜色
3、背景颜色
4、图标
5、显示时长

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


