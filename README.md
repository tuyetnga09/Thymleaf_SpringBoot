# Thymleaf_SpringBoot
1. Thymleaf là gì?
- Là một Java template engine dùng để xử lý và tạo HTML, XML, Javascript, CSS và text.
- Mục tiêu chính của thymeleaf là mang lại các template tự nhiên, đồng nhất, đơn giản (nature templates) cho công việc phát triển.
2. Tại sao lại sử dụng Thymleaf?
-  Để phục vụ XHTML/HTML5 trên tầng View (View Layer) của ứng dụng Web dựa trên kiến trúc MVC.
-  Với Thymeleaf, nó đã viết sẵn một documentation Thymeleaf từ a- z giúp các bạn có thể học nó.
3. So sánh giữa thymleaf và jsp
- Thymeleaf là thuần HTML, để hiển thị dữ liệu từ server nó sẽ dùng các thẻ html do thymeleaf cung cấp
- File JSP có thể nhúng code java (cái này hạn chế, tốt nhất là không làm), hiển thị dữ liệu bằng JSTL
* Có thể xem nhiều hơn tại đây: [https://www.thymeleaf.org/doc/articles/thvsjsp.html](https://mindmajix.com/thymeleaf-vs-jsp)
4. Cú pháp
- Cú pháp của Thymeleaf sẽ là một attributes (Thuộc tính) của thẻ HTML và bắt đầu bằng chữ th:
- Ví dụ: 
 <img width="434" alt="Screenshot 2023-05-14 at 12 25 02" src="https://github.com/tuyetnga09/Thymleaf_SpringBoot/assets/108625115/d02bebb7-0a87-4e95-9ab5-6d61e5accf4d">
 
5. Giải thích các package trong project.
- Entity: Chứa các thuộc tính - mapping với cơ sở dữ liệu 
- Repository: Chứa các phương thức mà spring cung cấp sẵn: Thêm mới, sửa, xoá, đọc, tìm kiếm,... dữ liệu.
- Controller: chứa đường dẫn để dẫn tới các trang web và code xử lý logic.
- File resources: chứa file templates: chứa các file html, chứa file static:  thư viện: css, js,...
- application.properties: chứa tất cả các config. 

Và ở project này có 2 đối tượng: Category và Product có quan hệ 1-n

Đây là mà hình web sau khi hoàn thành xong 1 project với CRUD đơn giản:

5.1. Hiển thị danh sách thể loại(Category)
<img width="1440" alt="Screenshot 2023-05-14 at 12 31 11" src="https://github.com/tuyetnga09/Thymleaf_SpringBoot/assets/108625115/dd8775f1-f966-430d-bdb2-a67122e1c4a2">

5.2. Hiển thị danh sách sản phẩm(Product)
<img width="1438" alt="Screenshot 2023-05-14 at 14 07 42" src="https://github.com/tuyetnga09/Thymleaf_SpringBoot/assets/108625115/bc0e7432-6d68-4daa-ad66-6e7c711bc2d0">


5.3. Form thêm và sửa thông tin sản phẩm 
<img width="1255" alt="Screenshot 2023-05-14 at 12 35 59" src="https://github.com/tuyetnga09/Thymleaf_SpringBoot/assets/108625115/2692b97b-93d4-4db1-9d78-226d59eb0eb1">

* Ngoài ra mình còn đang tìm hiểu thêm các chức năng khác để hoàn thiện hơn.

** Giải thích cách vận hành của Thymleaf 

<img width="730" alt="Screenshot 2023-05-14 at 12 40 50" src="https://github.com/tuyetnga09/Thymleaf_SpringBoot/assets/108625115/4e61f6db-3fba-43bf-b8a1-4c9d54fdd965">

Các file HMTL do Thymeleaf tạo ra là nhờ kết hợp dữ liệu và template + quy tắc để sinh ra một file HTML chứa đầy đủ thông tin.






