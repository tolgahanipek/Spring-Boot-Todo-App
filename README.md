# SPRING BOOT APP DOCUMANTATION:
 java, h2 ve spring boot teknolojisiyle geliştirdiğim to do uygulamasında 
 ilk olarak https://start.spring.io/ adresine girerek oluşturacağım To do uygulamasını Generate etmek  için gerekli olan Konfigürasyon işlemlerlerini aşağıdaki görüldüğü gibi gerçekleştirdim. Akabinde önceden yüklemiş olduğum Intellij uygulaması ile Generate ettiğim dosyayı açtım.
 
 ![1](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/4cdb3f6f-8b3a-4abd-93fe-6bd4014fb2ba)
 
# Application.properties sayfası:
Bu kısımda ise sırasıyla Url üzerinden Uygulamama erişim sağlayabilmek için Server.port=8080 konutuyla localhost:8080 üzerinden siteye erişilmesini sağlayacak.
Veritabanı olarak ise H2 teknolojisini seçerek yerel database config işlemlerini yaptım. Sonra veritabanına erişmemei sağlayacak username kısmını admin, password kısmını ise password olarak belirledim. H2 veritabanı console üzerinden bağlanmak için h2 console ekranına bağlanmamı sağlayacak  spring.h2.console.path=/h2-console 
 kodunu yazdım. Böylece verilerimiz üzerinden bu konsol ekranından müdahale edebileceğiz. 


![1](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/6bf56c1f-d8c9-44a7-92f3-f84cdebf2688)

# Pom.uml(Dependencies sayfası):
Burada To do uygulamasıyla ilgili TyhmeLeaf, PostgreSql, H2, Maven spring boot,lombok vs gibi Dependenciesleri (Bağımlılıkları) ekledim. Bu bağımlılıkları ekleyerek projeyi amacıma uygun hale getirdim.

![1](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/d8ac84c6-b0ed-4148-afb5-80f0bd48b43b)

# Edit-todo-Item.html Sayfası:
Burada ise Herhangi bir kullanıcının Önceden oluşturmuş olduğu To do bilgisi için Güncelleme ve Kullanıcının gereksinimini tamamladığını belirten is Complete özelliği eklenmiştir. Ayrıca sayfasının tasarımı için gerekli olan css kodları içindedir. Kullaınıcının veritabanından aldığı kullanıcı id bilgisini alıp ona göre Update işlemi yapabiliyoruz. İs Complete checkbox ile de to do işlemini tamamlanıp tamamlanmadığını belirleyebildik.

![1](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/0b5bd47d-99d1-42f4-abf0-dbcd14f7d5da)

# To do uygulaması için yazmış olduğum kodlar:

# ERROR_PAGE.HTML:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/13de06e5-823a-4887-b0b6-ebb76571220b)

# INDEX.HTML:
![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/e66b90a4-6ea8-4796-8717-bf656bc75ef5)

# LOGIN_PAGE.HTML

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/314d78ff-62e5-4347-b795-a89ae5fd50af)

# NEW_TODO_ITEM.HTML

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/93ae65a5-4f27-4f32-a2a6-b1871fb3739e)

# REGISTER_PAGE.HTML

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/f1c2c119-cadc-4c77-aac3-f81e68566b03)

# HOME_CONTROLLER.JAVA

Burada To do Sayfasına Kullanıcıya ait verileri Tablo vasıtasıyla getirir ve Index.html ile ilgili bir bağlantı ayarı yaptık Bunu da ModelAndView sınıfıyla hallettim.
sayfasının default url adresi ise /t olarak belirledim.

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/63417c6b-215d-4aa3-a3a5-e9a618ee7932)

# TODO_FORM_CONTROLLER.JAVA:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/b7b34a17-531c-4f90-adde-e5f7f99e1393)

# UsersController.JAVA:

Burada ise login ve register sayfalarına yönlendirmek ve kullanıcı girişlerinin hata olması durumunda error_page sayfasına yönlendiren ayrıca sayfalar arası redirect işlemlerini yaptıracak kodları yazdım.

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/5770bdc3-768b-4a96-a822-d123cde517e2)

# TODOitem.java:

Burada kullanıcıyla ilgili to do bilgileri listelemesini sağlayan kodlar bulunmaktadır.

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/dc243355-3143-4662-8207-7f4d52f905db)

# UsersModel.java:

Bu kısımda kullanıcının login veya register sayfasına girerken gireceği bilgilerin veritabanı tarafından onaylanmasına ilişkin bir takım kodlar yer almaktadır.

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/e9239bf2-44d1-4fd4-89ef-24a8b10e130d)

# TodoItemRepository.java:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/88c2e916-141c-4db6-8d90-49d01d40f46e)

# UserRepository.java:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/d37eb389-5437-4bb4-9dea-ea51867cd92d)

# TodoItemService.java:

Burada Kulanıcıya ait olan todo bilgilerinin Kaydetme ve silme işlemleri için gerekli olan service kodlarını barındırır.

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/49b896a5-033d-4c4d-ba76-a6078feea7ce)

# UsersService.java:

Bu kısımda Kullaınıcının kaydolduğu verileri sırasıyla veritabanıa atar ve üye girişi işlemlerini yaptırır.

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/b772ac66-709d-4bf9-b8fb-95a911ba2198)

# TO DO APP UYGULAMAMIN ÇALIŞMA ANI:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/0daabbf1-97b7-49dd-a626-9a36b32fabdd)

# kayıt sayfası:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/31b56583-48f5-4fcd-8fa4-bb6c0971ccab)

# login sayfası:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/164e3ebf-5dca-4c6f-9e19-bae25236ee07)

# to do sayfası:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/171e1134-f5db-450d-a80a-6400d4e63d65)

# To do silme işlemi:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/234ed32d-7926-4d74-a574-a4824efa77c9)

# to do ekleme işlemi:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/66b3c665-3b86-4671-a123-d675de47e242)

# To do Düzenleme veya Güncelleme işlemi:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/4723b7db-d49d-4e51-b096-05e301e12aba)

# Oturum kapatma işlemi:

![image](https://github.com/tolgahanipek/Spring-Boot-Todo-App/assets/69389540/4ee2da85-db8f-4251-ac98-1c1e94a53bc0)























 



 
 




