# Kütüphane Yönetim Sistemi

Bu proje, Java programlama dili ile yazılmış basit bir komut satırı (console) tabanlı **Kütüphane Yönetim Sistemi** uygulamasıdır. Kullanıcıların kitap ekleyebileceği, arama yapabileceği, kitap ödünç alıp iade edebileceği temel bir sistem sunar.

## Özellikler

- 📘 Kitap ekleme (başlık ve yazar bilgisiyle)
- 🔍 Kitap ismine göre arama (tek kelime bile yeterli, büyük/küçük harf duyarsız)
- 🧾 Kitaplar için otomatik ISBN üretimi (kitap adı ve yazara göre algoritmik)
- 📥 ISBN ile kitap ödünç alma (yalnızca kitap mevcutsa)
- 📤 ISBN ile kitap iade etme
- 📚 Kütüphanedeki tüm kitapları listeleme (mevcut ya da ödünç bilgisiyle)
- 🔄 Sürekli dönen menü arayüzü (kullanıcı çıkana kadar)

## ISBN Üretim Algoritması

ISBN şu şekilde oluşturulur:
- Kitap adının ilk 3 harfi (yoksa tamamı)
- Yazar adının ilk 3 harfi (yoksa tamamı)
- Yukarıdaki harflerin ASCII değerlerinden elde edilen 3 haneli bir kontrol numarası

**Örnek:**
```
Kitap Adı: Nesne Tabanlı Programlama  
Yazar: Ahmet Demir  
→ ISBN: NESAHM561
```

## Nasıl Çalıştırılır?

1. Java yüklü olduğundan emin olun (JDK 8 ve üzeri).
2. Tüm Java kodunu `LibraryManagementSystem.java` adlı bir dosyaya yapıştırın.
3. Terminal veya komut satırından şu komutu çalıştırarak derleyin:
   ```bash
   javac LibraryManagementSystem.java
   ```
4. Daha sonra çalıştırmak için:
   ```bash
   java LibraryManagementSystem
   ```

## Örnek Kullanım

```
--- Library Management System ---
1. Add Book
2. Display All Books
3. Search Book (By Title)
4. Borrow Book (By ISBN)
5. Return Book (By ISBN)
6. Exit
Enter your choice: 1
Book Title: Veri Yapıları
Book Author: Elif Kaya
Book successfully added. ISBN: VERELI496
```

## Geliştirici Notları

Bu proje aşağıdaki konularda pratik yapmak amacıyla geliştirilmiştir:
- Nesne yönelimli programlama (class, nesne)
- Koleksiyon kullanımı (ArrayList)
- Konsol tabanlı kullanıcı etkileşimi (Scanner)
- Döngüler ve koşullar ile kontrol akışı
- Basit algoritma geliştirme (ISBN üretimi gibi)

---

Projeyi ihtiyacınıza göre özgürce geliştirebilir, genişletebilirsiniz. ✨
