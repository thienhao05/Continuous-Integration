=======================

BƯỚC VÀO CI - CẤU HÌNH CI - CHỈ CHO GITHUB BIẾT CÁCH LIÊN TỤC KIỂM TRA CODE COI CODE
CÓ ĐANG XANH HAY KO, BẤT KÌ KHI NÀO AI ĐỤNG VÀO SERVER, CHỈNH SỬA TRÊN SERVER

ĐỂ CI VẬN HÀNH TA CẦN

1. 1 KHO CHỨA CODE - GITHUB ĐÃ CÓ

2. 1 PROJECT Ở TRONG KHO, CÓ CODE CHÍNH - MAIN, VÀ CODE TEST (UNIT TEST/JUNIT)
   VÀ QUÁ TRÌNH BIÊN DỊCH ĐÓNG GÓI PHẢI GẮN KẾT VỚI VIỆC CHẠY UNIT TEST
   DÒNG 1204 TRONG FILE BUILD-IMPL.XML ĐÃ LÀM

3. LẮNG NGHE ĐƯỢC AI ĐÓ ĐƯA CODE LÊN SERVER/KHO CHỨA CHUNG
   GITHUB ACTIONS LÀ TÍNH NĂNG MỚI CỦA GITHUB NÓ SẼ LO ĐIỀU NÀY

4. KHI AI ĐÓ SỬA CODE THÌ PHẢI KÍCH HOẠT NGAY QUY TRÌNH BUILD, TỨC LÀ ANT PHẢI ĐC CHẠY
   VÀ CHECK LUÔN XANH ĐỎ - CODE UNIT TEST PHẢI ĐC CHẠY

- Unit Test trả về đỏ, bắn email chửi ku dev vừa đưa code lên
- Unit Test trả về xanh, code ngon lành, tích hợp thành công, ko nói năng gì cả!!!

Liên tục liên tục như thế

LÀM SAO CHẠY ĐC ANT TRÊN GITHUB?

Vậy ta cần những điều sau:

1. Cần 1 server có cài JDK, có cài Ant
2. Chạy dc lệnh ANT đưa file build.xml cho file file ANT này
3. Lệnh chạy ANT để đóng gói .JAR .WAR sẽ chạy luôn cái Unit Test để check XANH ĐỎ
   - Unit Test mình đang xài .JAR bên ngoài - tức là JUnit.JAR
   - JUnit này thì ko có sẵn trên server GitHub!!! do là thư viện ngoài, ko thuộc JDK

4. Dịch xong, chạy JUnit xong, ổn thì RA ĐC .JAR .WAR. Có chỗ để upload/lưu trữ/download/
   deploy cái file .JAR .WAR này.
   - Ví dụ nếu .JAR cho cất lên server nào đó để download dùng sau
   - Ví dụ nếu là .WAR đưa lên 1 server có Tomcat để test thử app - HEROKU

NHỮNG CÔNG VIỆC CƠ BẢN NÀY GỌI LÀ CI - CONTINUOUS INTEGRATION

VÀ RẤT MAY GITHUB CUNG CẤP HẾT CHO MÌNH NHỮNG THỨ NÀY, MÌNH CHỈ VIỆC KHAI BÁO
CẤU HÌNH MẤY THÔNG SỐ: SERVER NÀO, JDK GÌ, ANT GỌI RA SAO, UPLOAD .JAR .WAR ĐI ĐÂU

\*NẾU KO THÍCH GITHUB LO GIÙM, THÌ TA XÀI CÁC TOOL CI KHÁC, VÍ DỤ:

- Jenkins, Bamboo CI, Team City CI, Circle CI, Travis CI... hoặc MS Azure DevOps
- CẤU HÌNH CÁC THÔNG SỐ MIỆT MÀI LUÔN -> LƯƠNG 2K TRỞ LÊN

* NHỜ GITHUB LO VIỆC ĐÓNG GÓI & CHECK XANH ĐỎ

- Khai báo mượn 1 server của GitHub - mượn server Ubuntu
- Khai báo mượn JDK 18
- Khai báo nếu ai đó đụng vào/update KHO/project, bất cứ file nào đc update/thêm mới
  lập tức GỌI NGAY NGƯỜI KIẾN ANT ĐỂ ĐÓNG GÓI/BUILD/CHECK

- Nếu code XANH, CHO PHÉP DOWNLOAD FILE.JAR
- Nếu code ĐỎ, BẮN EMAIL CHỬI

TÁT CẢ NHỮNG VIỆC NÀY LƯU LẠI TRONG 1 FILE, ĐẶT TÊN FILE NÀY LÀ GÌ CX ĐC, NHƯNG MỞ RỖNG ĐUÔI TẬP TIN PHẢI LÀ 1 CHỮ ML: YML (ZA-MỒ)

---

KHI GITHUB NÓ PHÁT HIỆN AI SỬA CODE, UPLOAD LÊN, LẬP TỨC CHẠY CÁC LỆNH Ở TRONG FILE .YML NÀY, TRONG ĐÓ CÓ LỆNH ANT BUILD APP & CHECK XANH ĐỎ

FILE NÀY VIẾT ĐÚNG CÚ PHÁP, QUY ƯỚC CỦA NGÔN NGỮ YML + CÚ PHÁP LỆNH CỦA GITHUB
THÌ GITHUB MỚI HIỂU & TỰ ĐỘNG CHẠY LỆNH MÌNH MUỐN

FILE NÀY PHẢI LƯU Ở THƯ MỤC
=> .GITHUB/WORKFLOWS \ y chang README.md phải nằm ngay thư mục gốc của project

## CI LÀ CẤU HÌNH QUY TRÌNH BUILD APP 1 CÁCH TỰ ĐỘNG

.YML .YAML (ZA-MỒ) cũng là 1 loại ngôn ngữ đánh dấu (ML markup - language)
LÀ 1 TẬP HỢP CỦA 1 ĐỐNG CÁC THẺ/TAG/TÊN-QUY ƯỚC DÙNG ĐỂ ĐỊNH DẠNG DATA
THƯỜNG ĐC DÙNG ĐỂ LƯU CÁC THÔNG SỐ CẤU HÌNH CỦA 1 HỆ THỐNG NÀO ĐÓ

---

VIỆC PHỤ - QUAN TRỌNG - ĐƯA CHO GITHUB THƯ VIỆN JUNIT ĐỂ LÁT HỒI ANT CỦA GITHUB XÀI!!!

- Máy mình, CI dễ dàng do mình có: JDK, JUnit, source code rồi, ANT (đi kèm NetBeans)
- Server GitHub, nơi tập trung source của toàn bộ team, thì thiếu: JDK, ANT, JUnit
  mượn, mượn, ko mượn, tự đưa của GitHub

> [!Note]
> => Chốt lại thư viện thì mình phải tự đưa cho github để mà có nó auto test. Phục vụ cho quá trình CI/CD.
