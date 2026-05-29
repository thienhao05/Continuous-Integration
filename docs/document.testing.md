V. CÁC KĨ THUẬT/CÁC CÁCH THỨC/PHƯƠNG PHÁP CỤ THỂ ĐỂ TÌM BUG/NGĂN NGỪA BUG
Có document, có code, có app, vậy thì làm thế nào để tìm bug, ngăn ngừa bug ?

Nếu ta focus vào code/vào tiến độ hoàn thành code để hoàn thành app thì ta có 4 mức độ
4 level của việc kiểm thử

> [!NOTE]
> II. AI THAM GIA VÀO CÔNG ĐOẠN ĐẢM BẢO CHẤT LƯỢNG PHẦN MỀM???
>
> 1. DEVELOPER
>
> - Developer phải có trách nhiệm với từng đoạn code/đơn vị code mà mình viết ra!!!
>   Bức tường trong xây dựng thì được tạo nên từ những viên gạch
>   Đồ vật -> từ nguyên tử
>   Xe máy -> từ những linh kiện
>   1 app được nên từ 2 đơn vị cơ bản: - HÀM (FUNCTION/METHOD) - CLASS
>   2 đơn vị cơ bản này phải được test kĩ bởi Developer trước!!!
>   Việc kiểm thử hàm/class chạy đúng hay không, chính xác hay không được gọi là UNIT TESTING.
>   Làm thế nào, cụ thể để thực hiện thao tác kiểm thử hàm/class thì ta có nhiều cách...

- Có 4 mức độ của việc kiểm thử ứng với 4 giai đoạn hoàn thiện app/4 giai đoạn viết code level

1. UNIT TESTING LEVEL

- Developer vừa hoàn thành đc 1 hàm/1 function/1 method/ 1 class, anh ta phải có trách
  nhiệm đảm bảo rằng hàm/class/method ngon, dùng ổn, xử lý đúng đắn
  1 hàm, 1 class, 1 method đc gọi là đơn vị cơ bản của code - a unit of code
- Việc test hàm/method/class để kiểm tra tính đúng đắn của nó gọi là UNIT TEST(ING)
- Test ở giai đoạn unit/code mới hình thành thì gọi là: UNIT TESTING LEVEL
  Code/app vừa mới hoàn thiện ở mức độ đơn vị - test ngay ở mức độ này!!!
  Các thuật ngữ xuất hiện trong gia đoạn này:
- Unit Test(ing), Unit Testing Framework, Test Automation (Automated Testing), Manual Tesing
- TDD - Test Driven Development
- DDT - Data Driven Testing

- Unit Testing nó có liên quan/dây mơ rễ má với CI(Continuos Integration - tích hợp liên tục), CI dính đến CD/DevOps
  CI thì dính đến SCM/VCS:
  Git, GitHub, GitLab, Bitbucket, Jenkins, GitHub Actions
  Source Control Mannagement System
  Version Control System

2. INTEGRATION TESTING LEVEL

3. SYSTEM TESTING LEVEL

4. UAT - (USER ACCEPTANCE TESTING) LEVEL

![alt text](image.png)

C:\Program Files\NetBeans-13\netbeans\platform\modules\ext
[link hướng dẫn](https://youtu.be/zq6XcnZb9L0?list=PLayYhLZuuO9vPw1t2GecXHkvRfWTnaS1X&t=2150)
