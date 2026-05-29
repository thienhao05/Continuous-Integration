- Phần mềm dc đo riêng theo nhu cầu của từng cty/tổ chức/đơn vị: App bán hàng của 7-Eleven
  cài đặt cho công ty đặt hàng xài thử để lấy feedback
  App BV Chợ Rẫy cài cho các bác sĩ, y tá, điều dưỡng, phòng xét nghiệm/chụp chiếu xài thử
  (99% ko có bản download)

IV. 7 VIÊN NGỌC RỒNG!!! 7 PRINCIPLES OF SOFTWARE TESTING

7 điều dưới đây dùng để định hướng hoạt động của dân QC, chỉ cho dân QC biết nên làm gì và ko nên làm gì, khi nào thì nên dừng việc kiểm thử lại để release sản phẩm, định hướng các công việc của dân kiểm thử: nên tập trung tìm bug ở đâu, dân QC sẽ có thể mắc những sai lầm gì?

Mỗi môn học, mỗi chủ đề kiến thức thì đều có những luận điểm chủ đạo cần phải nhớ!!!

- OOP: 4 + 5
  A, E, I, P S, O, L, I, D

A, E, I, P là 4 tính chất/nguyên lý cơ bản của lập trình hướng đối tượng (OOP):

- A: Abstraction (Trừu tượng hóa): Là quá trình ẩn đi các chi tiết phức tạp và chỉ hiển thị những thông tin cần thiết. Điều này giúp giảm sự phức tạp và tăng tính tái sử dụng của mã nguồn.

- E: Encapsulation (Đóng gói): Là quá trình đóng gói dữ liệu và các phương thức liên quan vào một đơn vị duy nhất, thường là một lớp. Điều này giúp bảo vệ dữ liệu khỏi sự truy cập trái phép và tăng tính bảo mật của ứng dụng.

- I: Inheritance (Kế thừa): Là khả năng của một lớp con kế thừa các thuộc tính và phương thức của một lớp cha. Điều này giúp tái sử dụng mã nguồn và tạo ra các cấu trúc phân cấp trong lập trình.

- P: Polymorphism (Đa hình): Là khả năng của một đối tượng có thể có nhiều hình thức khác nhau. Điều này cho phép các đối tượng thuộc các lớp khác nhau có thể được xử lý thông qua cùng một giao diện, giúp tăng tính linh hoạt và mở rộng của ứng dụng.

* AGILE: 4

* SOFTWARE TESTING: 7

1. NL 1: Kiểm thử phần mềm là tìm ra bug:
   Kiểm thử phần mềm KHÔNG mang mục đích là đi chứng minh app ko có bug
   Không dc hứa là app KO có bug
   App luôn có bug, tồn tại bug, tiềm ẩn bug, dù test kĩ cỡ nào!!!

Kết nối hãng thứ 3 thì app bị lỗi thì trong tình huống này làm gì ? Timeout thì chúng ta sẽ cần phải thông báo, cần phải chỉnh sửa, thiết lập những cái trạng thái trong tình huống đó là gì ?
Nếu app bị lỗi thì chúng ta sẽ cần phải thông báo, cần phải chỉnh sửa, thiết lập những cái trạng thái trong tình huống đó là gì ?
Chúng ta định hướng việc làm

- Tìm ra bug, tìm ra lỗi, tìm ra vấn đề, tìm ra những điểm chưa hoàn thiện của app
- Các cách thứ tìm ra bug hay ngăn ngừa bug: test case, test scenario, test plan, checklist, exploratory testing, automation testing, v.v...

## SOFTWARE TESTING: 7 PRINCIPLES OF SOFTWARE TESTING

### 1. NL1: Kiểm thử phần mềm là tìm ra bug

- Kiểm thử phần mềm **không** mang mục đích là đi chứng minh app không có bug.
- Không được hứa là app **không có bug**.
- App luôn có bug, tồn tại bug, tiềm ẩn bug, dù test kỹ cỡ nào.
- Việc của dân QC là cố gắng tìm càng nhiều bug càng tốt, cố gắng tìm ra những bug nghiêm trọng để tránh ảnh hưởng đến users.

Dù việc tồn tại bug là sự thật hiển nhiên thì dân QC vẫn phải có trách nhiệm đảm bảo app ít bug nhất có thể, ít bug nghiêm trọng nhất có thể để giữ uy tín và chất lượng cho công ty.

---

### 2. NL2: Exhaustive Testing Is Not Possible — Không thể kiểm thử toàn bộ

- Không thể mô phỏng hết tất cả các tình huống sử dụng app của user.
- Đồng nghĩa với việc ta không thể kiểm thử tất cả các tình huống xảy ra khi user dùng app.

**Lưu ý:**

QC là người sử dụng app trước thiên hạ, trước user để tìm bug.

Họ sẽ cần phải giả lập, mô phỏng, clone, tưởng tượng cách sử dụng app của user và sử dụng thử để xem app xử lý có đúng không, có văng lỗi không.

Nếu có bug, báo developer fix trước để sau này user không gặp bug. Đó là kỳ vọng của kiểm thử.

QC phải giả lập các cách dùng app của user theo nhiều hướng:

- Nhập data tử tế → app phải trả ra kết quả như kỳ vọng: `expected == actual`.
- Nhập data cà chớn, cố tình nhập sai, làm sai thao tác màn hình:
  - App phải chặn được các tình huống này, báo lỗi khi cần thiết.
  - Nếu app không làm được điều này, sau này user dùng thật sẽ bị văng màn hình.

- Test thêm các tình huống ngoại lệ không mong đợi:
  - Mạng rớt.
  - Thiết bị trục trặc.
  - App chờ 3 phút rồi timeout.

**Ví dụ:** App Calculator có số tổ hợp/cách sử dụng riêng phép cộng là vô chừng. Làm sao dám kết luận phép cộng là đúng cho tất cả các tình huống?

Có thể sử dụng:

- Phép `+` với 2 số.
- Số 1 dãy.
- Số dương, số âm.
- Số thập phân.
- Phối hợp với `-`, `*`, `/`.

Phải có chiêu/kỹ thuật dừng việc test quá trình/tình huống mà vẫn dám kết luận, ví dụ:

- Chia miền giá trị để kiểm thử — **Equivalence Partitioning**.
- Quy nạp.

---

### 3. NL3: Early Testing — Kiểm thử phần mềm càng sớm càng tốt

- Kiểm thử phần mềm được làm ngay, thậm chí khi chưa có một dòng code nào được viết ra.
- Kiểm thử phần mềm nên bắt đầu ngay khi đi lấy requirements.
- Kiểm thử phần mềm nên thực hiện ngay trên:
  - Requirements.
  - SRS.
  - FRs.
  - Design.

- Không chờ đến khi viết code xong hoặc ra app rồi mới test.

Bạn có thể phối hợp với:

- BA — Business Analyst.
- BrSE — Bridge Software Engineer.
- PO — Product Owner.

Để kiểm thử các document, kiểm thử design, kiểm thử ERD... từ sớm.

- Mô hình **V-Model** đã học mang ý nghĩa của **Early Testing**.
- Công ty không áp dụng V-Model thì vẫn rất cần testing từ sớm.

---

### 4. Defect Clustering — Sự phân bố của bug

Nguyên lý này liên quan đến một nguyên lý trong thống kê/kỹ năng mềm: **Nguyên lý Pareto 80/20**.

**Ý nghĩa:** Mọi thứ thường phân bố hoặc tập trung nhiều vào một số vị trí nhất định.

Trong phần mềm, cũng có những chỗ, những tính năng hoặc module tập trung nhiều bug hơn các chỗ khác.

Những nơi thường dễ có nhiều bug:

- Những module có giao tiếp với mạng, thiết bị ngoài hoặc sensor.
- Những module/tính năng có giao tiếp với app của bên thứ ba — **3rd party**.
- Những chức năng liên quan đến timeout của xử lý.
- App có kết nối MoMo.
- Lưu data trên Cloud.
- Login bằng Gmail, Facebook.

Những phần thường ít bug hoặc ít bug nghiêm trọng hơn:

- CRUD user.
- CRUD sản phẩm.

Khi biết có một chỗ trong app nhiều bug hơn các chỗ khác, đó là lúc cần có chiến lược phân bổ nhân lực và tập trung test kỹ hơn vào những khu vực đó.

---

### 5. Pesticide Paradox — Nghịch lý thuốc trừ sâu

**Ví dụ thực tế:**
Hiện tượng lờn thuốc hoặc kháng thuốc: sử dụng thuốc kháng sinh, phun thuốc trừ sâu nhưng bệnh không lui, sâu không hết hoặc không khỏi.

Trong kiểm thử phần mềm:

- Nếu dân QC test mãi một chức năng hoặc một app.
- Làm mãi một điều gì đó trong thời gian quá dài.
- Người test có thể bị “mòn/chai” cảm xúc, cảm giác và sự sáng tạo.
- Dễ trở nên chủ quan, nhàm chán, làm đại, làm qua loa.
- Khi giả định rằng app đã quen, đã test hoài rồi, tester dễ bỏ qua hoặc làm sơ sài những màn hình quen thuộc vì nghĩ nó vẫn ổn.
- Kết quả: bug có thể xuất hiện, đặc biệt là bug nguy hiểm.

Mỗi lần bàn giao sản phẩm mà để sót bug hoặc tồn tại bug nguy hiểm là biểu hiện của nghịch lý này.

**Cách khắc phục:**

- Nên hoán đổi công việc, chức năng hoặc app cho đội QC định kỳ.
- Ví dụ:
  - 6 tháng test app này, 6 tháng sau test app khác.
  - 6 tháng test mobile, 6 tháng test web app.

- Duy trì được sự tò mò, khám phá và sáng tạo do môi trường thay đổi.

---

### 6. NL6: Context Dependent — Kiểm thử phụ thuộc ngữ cảnh

- Các loại app khác nhau, môi trường vận hành app khác nhau thì phải có phương pháp test khác nhau.
- Cần biết linh hoạt tùy loại app và ngữ cảnh để chọn cách thức test phù hợp.

**Ví dụ:**

- App AI:
  - Tập trung vào sự đa dạng của data.
  - Ảnh biển số xe: xe tỉnh, xe Sài Gòn, biển mờ, biển rõ, cho app giữ xe.

- Web app:
  - Kiểm thử khả năng chạy trên PC/laptop.
  - Kiểm thử trên mobile — responsive.

- App có sử dụng thiết bị ngoài:
  - Cảm biến.
  - Camera.
  - Cần kiểm thử cấu hình và khả năng tương thích thiết bị.

- App chạy trên:
  - iOS.
  - Android.
  - Windows.
  - Cần kiểm thử phần hiển thị, performance và các phần liên quan.

- Nhập liệu:
  - Touch screen.
  - Import từ Excel.
  - Scan barcode.

---

### 7. Absence of Errors Fallacy — Ảo tưởng rằng app đã hết bug

- Không nên khoe hoặc khẳng định rằng app đã hết bug, ít bug hay không có bug.
- Việc này không có nhiều ý nghĩa vì làm app ít bug, không bug nghiêm trọng là điều hiển nhiên phải hướng tới.

Điều quan trọng hơn là:

- App sử dụng được.
- App có tính đúng đắn.
- App phục vụ đúng nhu cầu người dùng.
- Người dùng sử dụng app tốt trong công việc của họ.

Nếu muốn quảng bá sản phẩm, hãy quảng bá rằng:

- App đã được **UAT**.
- User khoái sử dụng app.
- Lượng download tăng đều.
- App rất đáng tin dùng.
- App được người dùng sử dụng tốt trong công việc của họ.

**Tóm lại:**
Làm app là hướng về user, được user tin dùng. Các **requirements/functions/features** phải đảm bảo phù hợp nhu cầu thị trường và user. Vì vậy, cần áp dụng **Early Testing** ngay trong giai đoạn phân tích.
