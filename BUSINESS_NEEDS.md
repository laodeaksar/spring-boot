# Kebutuhan Bisnis E-Commerce

Dokumen ini menguraikan kebutuhan fungsional untuk pengembangan aplikasi e-commerce baru yang bertujuan untuk merampingkan operasi bisnis, meningkatkan efisiensi, dan skalabilitas.

## 1. Entitas Utama

### 1.1. Produk
- Setiap produk harus memiliki **kode unik** sebagai pengenal.
- Setiap produk harus memiliki **deskripsi yang detail**.

### 1.2. Pelanggan (Customer)
- Pelanggan diidentifikasi menggunakan informasi berikut:
  - **Nama Depan** (First Name)
  - **Nama Belakang** (Last Name)
  - **Email**
  - **Alamat** (Address)

### 1.3. Pesanan (Order)
- Pelanggan dapat membuat pesanan yang terdiri dari satu atau lebih produk dari daftar yang tersedia.

### 1.4. Pembayaran (Payment)
- Setiap transaksi pelanggan harus melibatkan **metode pembayaran** yang spesifik.
- Status pembayaran harus dicatat (berhasil atau gagal).

## 2. Proses Bisnis & Alur Kerja

### 2.1. Proses Pemesanan
1. Pelanggan memilih produk untuk membuat pesanan.
2. Pelanggan melakukan pembayaran untuk pesanan tersebut.

### 2.2. Notifikasi Email
- Setelah transaksi pembayaran selesai, sistem harus secara otomatis mengirimkan notifikasi melalui **email** kepada pelanggan.
- **Email Konfirmasi Keberhasilan:** Dikirim jika pembayaran berhasil.
- **Email Notifikasi Kegagalan:** Dikirim jika pembayaran gagal.

## 3. Tujuan Aplikasi

Tujuan utama dari pengembangan aplikasi ini adalah:
- **Menyederhanakan proses bisnis** yang saat ini masih manual.
- **Meningkatkan efisiensi operasional** secara keseluruhan.
- **Memastikan skalabilitas** untuk pertumbuhan bisnis di masa depan.
