 大家对MVC的架构模式再熟悉不过。今天我们就学习一下MVP架构模式。


### MVC和MVP之间的对比


 
![mvc和MVP之间的对照](http://upload-images.jianshu.io/upload_images/4614633-b9bdf5938cfb90cf.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)





### 什么是MVC(Model View Presenter)模式?

- 1、为了使得视图接口可以与模型和控制器进行交互，控制器执行一些初始化事件
- 2、用户通过视图（用户接口）执行一些操作
- 3、控制器处理用户行为(可以用观察着模式实现)并通知模型进行更新
- 4、模型引发一些事件，以便将改变发告知视图
- 5、视图处理模型变更的事件，然后显示新的模型数据
- 6、用户接口等待用户的进一步操作

### MVP的优势
- 1、模型与视图完全分离，我们可以修改视图而不影响模型
- 2、可以更高效地使用模型，因为所以的交互都发生在一个地方——Presenter内部
- 3、我们可以将一个Presener用于多个视图，而不需要改变Presenter的逻辑。这个特性非常的有用，因为视图的变化总是比模型的变化频繁。
- 4、如果我们把逻辑放在Presenter中，那么我们就可以脱离用户接口来测试这些逻辑（单元测试）
### MVP的问题
由于对视图的渲染放在了Presenter中，所以视图和Persenter的交互会过于频繁。

还有一点你需要明白，如果Presenter过多地渲染了视图，往往会使得它与特定的视图的 联系过于紧密。一旦视图需要变更，那么 Presenter也需要变更了。比如说，原本用来呈现Html的Presenter现在也需要用于呈现Pdf了，那么视图很有可能也需要变更。



### 一个简单的登陆实例

效果图：

![效果图.gif](http://upload-images.jianshu.io/upload_images/4614633-fe15cb3965f72e93.gif?imageMogr2/auto-orient/strip)

### 目录结构

![mvp用例项目结构](http://upload-images.jianshu.io/upload_images/4614633-ba6b1ef6a29cea75.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![mvp用例项目结构](http://upload-images.jianshu.io/upload_images/4614633-92b770b14ae94a90.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




#### P层

![P层.png](http://upload-images.jianshu.io/upload_images/4614633-986e4eeed1fbc72c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### v层

![v层.png](http://upload-images.jianshu.io/upload_images/4614633-36b23ca8437c9801.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![acitivity.png](http://upload-images.jianshu.io/upload_images/4614633-bd878a68f9e160af.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### M层
![M层.png](http://upload-images.jianshu.io/upload_images/4614633-4030dc7cfbf47fb1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

看起来要复杂的比较多。代码量也相对比较大。但是如果用到大项目中我们就能显示出优势了。接下来进行mvp的封装。

>项目地址：
>
>https://github.com/androidstarjack/MvpSimpleStudy

> 服务端测试项目地址：
> 
> http://download.csdn.net/download/androidstarjack/9966557
> 

> 参考链接：
>
> http://www.360doc.com/content/13/0808/13/7427585_305589280.shtml



### 相信自己，没有做不到的，只有想不到的
 如果你觉得此文对您有所帮助，欢迎入群 QQ交流群 ：232203809 
微信公众号：终端研发部 

 
![技术+职场](http://upload-images.jianshu.io/upload_images/4614633-977d06f49c7ba7be.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

（欢迎关注学习和交流） 
 
