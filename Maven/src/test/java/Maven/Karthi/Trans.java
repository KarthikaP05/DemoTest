package Maven.Karthi;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Trans implements IAnnotationTransformer {
	
	
	public void transform(ITestAnnotation annotation,Class testClass,Method testMethod,Class<?> occuringClazz) {
		
		annotation.setRetryAnalyzer(MyRetryClass.class);
	}
}