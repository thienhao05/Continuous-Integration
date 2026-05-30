/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.thienhao05.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.thienhao05.mathutil.core.MathUtil.*;

/**
 *
 * @author PC
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //Viết code để kiểm thử code ở bên trên
    
    //chuẩn bị data, mảng 2 chiều vì nó có n đưa vào và expected 
    //và có nhiều cặp như thế [7]
    //mảng 2 chiều [7][2]
    
    @Parameterized.Parameters //hàm này đưa vào 1 đống data nhiệm vụ phải loop data foreach
    public static Object[][] intData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        
        int c[][] = {
                     {1, 0}, 
                     {1, 1}, 
                     {2, 2}, 
                     {6, 3}, 
                     {24, 4}, 
                     {120, 5}, 
                     {720, 6}
                    };
        
        
        //mảng của wrapper class or object nào đó
        return new Integer[][] {
                                {1, 0}, 
                                {1, 1}, 
                                {2, 2}, 
                                {6, 3}, 
                                {24, 4}, 
                                {120, 5}, 
                                {720, 6}
                               };
        
    } //xài Wrapper class nếu chơi số, ví dụ Integer (int) Long (long)
    
    
    //sau khi có bộ data qua mảng 2 chiều, JUnit sẽ tự lặp for
    //để lôi ra từng cặp data (1, 0), (1, 1), (2, 2), (6, 3)...
    //nhồi cặp này vào trong hàm so sánh....
    //nhưng nhồi = cách nào, gán value này vào biến nào đó
    //gán vào biến - THAM SỐ HÓA PARAMETERIZED
    //TA SẼ MAP/ÁNH XẠ 2 CỘT ỨNG VỚI 2 BIẾN: CỘT 0 - EXPECTED 
    //                                       CỘT 1 - N ĐƯA VÀO HÀM GETF()
    
    @Parameterized.Parameter(value = 0)
    public long expected; //nguy hiểm về tính đóng gói vì cái này code test là điều đầu tiên
    //nếu mà mình để private thì lát nữa JUnit nó làm sao chạy được vào class này để nó lấy data được
    //thì nó phải lấy qua get/set -> lấy qua get/set mất công, đưa cho public luôn đi để cho dễ lấy
    //sờ ngay mà ko cần phải get và set
    //--> Nhớ này nè -> có phỏng vấn
    //kiến thức tốt về mặt diễn đạt thì lấy ngay
    
    @Parameterized.Parameter(value = 1) //map vào cột cho mình
    public int n;
    
    //New mới object sẽ nằm trong vùng nhớ HEAP
    
    //static là vùng nhớ có định nằm im trong RAM để anh em móc về xài
    //cho nên các hàm các object đều gọi đc static là lí do
    //data nó phải nằm in 1 chỗ
    
    //ví nếu chơi bên trong class là static thì mn đều nhìn thấy
    
    //test hay vì đã có các test case và data
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        assertEquals(expected, getFactorial(n)); //tham số hóa
        
        //test case trong mảng, chỉ có 1 hàm nhưng bản chất bên trong là 7 test cases
        
    }
}

//TDD: Test Driven Development
//DDT: Data Driven Development 
//DDT > TDD
//DDT là cha của TDD


//CLASS NÀY SẼ CHỨA CODE DÙNG ĐỂ TEST CODE CHÍNH Ở BÊN CLASS MATHUTIL
//CLASS NÀY SẼ CHỨA CODE DÙNG ĐỂ TEST HÀM getF() coi hàm chạy đúng hok
//Code viết ra dùng để test code khác (hàm khác/class khác)
//thì đoạn code này, class này đc gọi là: TEST SCRIPT
//Trong cái test script sẽ có những tình huống xài app, đưa data cụ thể vào
//chờ xem hàm xử lí kế quả có như kỳ vọng hay ko ?
//Một Test Script sẽ chứ nhiều TEST CASES
//                      mỗi test case ứng với 1 tình huống xài hàm

//Phân tích Test Script cũ - hôm qua kia
//Trong test script cũ xuất hiện bad smell, sự trùng lặp về câu lệnh
//dưới đây
//Assert.assertEquals(120, MathUtil.getFactorial(5));
//lệnh so sánh giá trị, lệnh gọi hàm đc lặp đi lặp lại với mỗi bộ test case
//Cũng hàm này, cũng lệnh này, nhưng nó phải viết lại cho các bộ 
//data sau:

//Expected:                   |  n  |
//-----------------------------------
//1                           |  0  |
//1                           |  1  |
//2                           |  2  |
//6                           |  3  |
//24                          |  4  |
//120                         |  5  |
//720                         |  6  |

//[7][2]: 7 tầng lầu mỗi tầng thì có 2 phòng, mảng 2 chiều
//1 chiều thì ngồi nhìn thằng, 1 dãy dài là xong


//Có cách nào kiểu thay 2 con số trong lệnh so sánh = 2 ??? nào đó
//Assert.assertEquals(???, MathUtil.getFactorial(???));

//Assert.assertEquals(expected, MathUtil.getFactorial(n));

//Phân tách data, xong rồi nhồi vào lại

//NẾU TA TÁCH ĐC TOÀN BÔ DATA TRONG CÁC CÂU LỆNH SO SÁNH Ở TRÊN
//RA 1 CHỖ RIÊNG BIỆT NHƯ HÀNG CỘT Ở TRÊN, SAU ĐÓ
//TA CHỈ VIỆC PICK/LẤY/TỈA DATA NÀY NẠP DẦN VÀO/NHỒI DẦN VÀO CÁI LỆNH
//GỌI HÀM, THÌ TA SẼ ĐẠT ĐC: 

//- Code gọn gàng hơi ko bị trùng lặp
//- Nhìn tổng quan biết có bao nhiêu test case và liệu rằng chúng đã
//đủ hay chưa

//Kĩ thuật viết test script (câu lệnh test) mà tách biệt data ra khỏi 
//lệnh so sánh đc gọi bằng những tên sau: 
//- PARAMETERIZED - THAM SỐ SỐ, BIẾN DATA RA 1 CHỖ, ĐẶT CHO CHÚNG CÁI 
//TÊN BIẾN, LÁT HỒI NHỒI CHÚNG TRỞ LẠI LỆNH SO SÁNH

//- DDT - DATA DRIVEN TESTING VIẾT CODE KIỂM THỬ THEO STYLE TÁCH DATA
//JUNIT FW HỖ TRỢ SẴN TA VỤ TÁCH DATA, DUYỆT VÒNG FOR TRÊN DATA
//NHỒI VÀO HÀM TƯƠNG ỨNG

//ĐỂ CHƠI VỚI DDT, TA CẦN
//- Tách data ra 1 chỗ - MẢNG
//- Map cái data này vào các biến tương ứng
//- Nhồi cái biến tương ứng này vào câu lệnh so sánh/gọi hàm

//MẢNG LÀ GÌ ? 
//- MẢNG TẬP HỢP CỦA RẤT NHIỀU THỨ CÓ CÙNG KIỂU, Ở GẦN NHAU
//- MẢNG LÀ DANH SÁCH KHAI BÁO NHIỀU BIẾN CÙNG 1 LÚC, CÙNG 1 TÊN, CÙNG KIỂU DỮ LIỆU
//VÌ BIẾN CHỨA VALUE


//INSTALL SHIELD
//NHÚNG TRONG BỘ SETUP