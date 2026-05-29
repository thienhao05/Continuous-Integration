package com.thienhao05.mathutil.core;

//CHẠY NGẦM ĐẢM BẢO CHẤT LƯỢNG

import junit.framework.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    @Test   //coding convention - quy tắc viết code
            //tên hàm kiểm thử/tên hàm của test script
            //phải nói lên ý nghĩa của việc kiểm thử
            //tình huốn này, ta mún test hàm getF() tham số tử tế
            //n = 0...20!!!
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case số #1: n = 0, hy vọng hàm trả về 1
        //                          thực tế hàm trả về mấy, đoán xem!!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //hàm chạy đi thì mới biết
        //so sánh giữa expected vs. actual, máy tự so, ko cần
        //sout() khổ cực
        Assert.assertEquals(expected, actual);
        
        
        //Test case #2: n = 1, hy vọng hàm trả về 1, thực tế???
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #3: n = 2, hy vọng hàm trả về 2, thực tế???
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    
    //@Test ra lệnh cho thư viện JUnit mình đã add/import
    //tự động generate ra cái hàm public static void main()
    //biến cái hàm tryJUnitComparision() thành hàm main()
    //và gửi hàm main() này cho JVM chạy - Java Virtual Machine
    //@Test ~~~~~ main()
    //ko có @Test thì class ko có main(), lấy gì mà chạy no runable method()
    //Thư viện viết code tự do giống như JDBC, còn framework giống SpringBoot
    //ép mình viết trong khuôn khổ nào đó
    
    @Test
    public void tryJUnitComparision() {
        //hàm này thử nghiệp việc so sánh expected vs. actual
        //coi sai đúng ra như thế nào!!!
        //ta đang xài hàm của thư viện JUnit nhưng ko xài bừa 
        //bãi mà phải viết theo quy tắc định trước
        //quy tắc định trước nằm ở @ - annotation
        Assert.assertEquals(69, 69);
        
        
        
    }
}

//bấm chọn hamcrest-core-1.3.jar
//và junit-4.13.2.jar
//C:\Program Files\NetBeans-13\netbeans\platform\modules\ext

//Lưu ý: là mình add jar
//https://youtu.be/zq6XcnZb9L0?list=PLayYhLZuuO9vPw1t2GecXHkvRfWTnaS1X&t=2150

//CLASS NÀY DEV SẼ VIẾT NHỮNG CÂU LỆNH DÙNG ĐỂ TEST HÀM
//CỦA CODE CHÍNH, TESTS CÁC HÀM CỦA CLASS MATHUTIL
//Trong class này sẽ có những lời gọi hàm getFacctorial()
//có những lệnh so sánh giữa EXPECTED VÀ ACTUAL 
//giống giống mình đã làm test ở bên MAIN()
//nhưng khác ở chỗ, SAI -> MÀU ĐỎ, ĐÚNG -> MÀU XANH
//mắt ko cần nhìn các dòng output từ hàm System.out cho mất sức
//mắt giờ chỉ nhìn 2 màu XANH ĐỎ
//Muốn có đc điều này ta sẽ dùng thêm các UNIT TESTING FRAMEWORK
//Ví dụ: JUnit, TestNG (Java)
//       xUnit, MSTest, NUnit (C#)
//       PHPUnit (PHP)
//       ....


//VIỆC VIẾT CODE ĐỂ TEST CODE GỌI LÀ UNIT TESTING
//ĐOẠN CODE TRONG CLASS NÀY DÙNG JUNIT/UNIT TESTING FRAMEWORK
//ĐỂ KIỂM THỬ HÀM CỦA CODE CHÍNH
//ĐOẠN CODE KIỂM THỬ NÀY ĐC GỌI LÀ: TEST SCRIPT
//Code dùng để test code (chính) gọi là test script
//Test case: mô tả cách sẽ test
//Test script là các đoạn code đc viết ra để test code chính (DAO,
//DTO, Controller, API,...)
//Muốn test thì cần phải phác thảo các TEST CASE
//Test Script sẽ sử dụng các Test Case
//Ví dụ: Viết code để test hàm getFactorial() với các case
//n = -5, 0, 1,...
//
