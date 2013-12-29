import java.lang.reflect.Method;
import java.io.File;

public class Hello {
	static
	{
		Method llm;
		try {
			//获取私有的方法 loadLibrary0
			llm = ClassLoader.class.getDeclaredMethod("loadLibrary0", new Class[]{Class.class,File.class});
			llm.setAccessible(true);//破解权限
			llm.invoke(null, new Object[]{Hello.class,new File("/home/yangbolin/JNI/Hello.so")});
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public Hello() {
	}
	
	//声明的本地方法   
  	public native void sayHello(String strName);  
  	
  	public static void main(String[] args) {
  		Hello hello = new Hello();
  		hello.sayHello("NUAA");
  	}
}
