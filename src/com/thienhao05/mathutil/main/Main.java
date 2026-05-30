/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.thienhao05.mathutil.main;

import com.thienhao05.mathutil.core.MathUtil;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This message comes from the main() method");
        System.out.println("This jar file is built based on ANT co-operating with JUnit");
        tryTDDFirst();
//        testFactorialGivenWrongArgumentThrowsException();
    }
    
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #3: đưa date cà chớn, n âm, n quá lớn
        //              hàm đc thiết kế ném về ngoại lệ!!!
        //Thấy ngoại lên mừng rơi nước mắt khi đưa vào -5
        //thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
//        System.out.println("Hope to see the Exception Illegal Arguement Exception");
//        MathUtil.getFactorial(-5);
    }
    
    //hàm này đc viết ra để dùng thử kĩ thuật viết code kiểu TDD
    //gọi thử/dùng thử hàm chính bên core/bên MathUtil
    //xem nó sai đúng ra sao, ở ngay mức khởi đầu viết code
    public static void tryTDDFirst() {
        
        //Test case #1 (tình huống kiểm thử hàm số 1/xài thử hàm):
        //- Input: n = 1
        //- Gọi hàm getFactorial(1)
        //- Hi vọng hàm trả về 1, vì 1! = 1
        
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs. actual coi chúng nó giống nhau hem?
        //giống -> hàm đúng với case đang test
        //sai   -> bug rồi!!! với case đang test
        System.out.println("Test 1! | Status: " +
                                    "Expected: " + expected +
                                    " | Actual: " + actual);  

        //Test case #2 (tình huống kiểm thử hàm số 2/xài thử hàm lần thứ 2):
        //- Input: n = 2;
        //- Gọi hàm getFactorial(2)
        //- Hi vọng hàm trả về 2, vì 2! = 2
        
        System.out.println("Test 2! | Status: " +
                                    "Expected: 2" + 
                                    " | Actual: " + MathUtil.getFactorial(2));  
    }
}

//TEST CASE LÀ GÌ ?
//Là 1 tình huống xài app/kiểm thử app/kiểm thử tính năng/màn hình
//chức năng/xử lí của app
//Test case là tình huống kiểm thử app/chức năng mà ki đó
//ta phải
//- đưa vào data giả/mẫu/test, 
//- đưa ra gái trị kì vọng ta mòng chờ app trả ra
//sau đó chờ hàm/tính năng xử lí xong trả ra kết quả!!! 
//và ta nhìn kết quả và ta so sánh với kì vọng trước đó!!!
//để kết luận hàm ổn/tính năng ổn, TEST CASE PASSED
//                                 TEST CASE FAILED

//Sự khác biệt giữa library và framework
//library là tập hợp 1 cái hàm, 1 cái class để giúp ta làm việc gì đó
//framework nó là việc giống như thư viện nhưng mà nó ép chúng ta làm việc theo cách của nó
//Annotation @ ép chúng ta làm gì đó, bị cái framework đó điều khiển
//Chủ động trong việc xử lý luồng, xử lý code
// Thuật ngữ trong Testing: 
//+ Test Driven (Đi ven) Development: là  kĩ thuật viết code đi kèm với viết các test để đảm bảo mỗi đoạn 
//code viết ra đảm bảo chất lượng
//XANH KHI TẤT CẢ TÌNH HUỐNG CÙNG XANH EXPECTED = ACTUAL
//CHỈ CẦN 1 TRONG NHỮNG TEST CASE != LÀ CHẾT
//CÓ 2 NGUYÊN NHÂN ĐỎ
//+ ACTUAL SAI EXPECTED ĐÚNG -> BUG
//+ KÌ VỌNG NGÁO             -> KÌ VỌNG SAI, KO CÓ CƠ SỞ SO SÁNH


//DDT: DATA DRIVEN TESTING