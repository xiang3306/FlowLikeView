# FlowLikeView
这是一款类似今日头条点赞的自定义控件
也可以实现音乐播放音符的飘动
用法：
xml加载
<com.example.flowlikeview.FlowLikeView
android:id="@+id/flow"
android:layout_width="300dp"
android:layout_height="150dp"
android:layout_centerHorizontal="true"
android:layout_marginTop="120dp"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent"
app:layout_constraintTop_toTopOf="parent" />

初始化：
 mFlow=findViewById(R.id.flow);
  List<Integer> resid = new ArrayList<>();
        resid.add(R.drawable.heart);
        resid.add(R.drawable.music);
        resid.add(R.drawable.start);
        mFlow.initParams(resid);
  
  
  
  开始：mFlow.start();
  
  
  停止：mFlow.stop();
  
  
  主要实现逻辑三阶贝塞尔曲线：
   // 这里运用了三阶贝塞儿曲线的公式, 请自行上网查阅
            float leftTime = 1.0f - fraction;
            PointF resultPointF = new PointF();

            // 三阶贝塞儿曲线
            resultPointF.x = (float) Math.pow(leftTime, 3) * startValue.x
                    + 3 * (float) Math.pow(leftTime, 2) * fraction * ctrlPointF1.x
                    + 3 * leftTime * (float) Math.pow(fraction, 2) * ctrlPointF2.x
                    + (float) Math.pow(fraction, 3) * endValue.x;
            resultPointF.y = (float) Math.pow(leftTime, 3) * startValue.y
                    + 3 * (float) Math.pow(leftTime, 2) * fraction * ctrlPointF1.y
                    + 3 * leftTime * fraction * fraction * ctrlPointF2.y
                    + (float) Math.pow(fraction, 3) * endValue.y;
