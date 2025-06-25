# 📌 Lowest Common Ancestor (LCA) di Binary Tree — UTS Struktur Data

Program ini dibuat untuk mencari **Lowest Common Ancestor (LCA)** dari dua node dalam sebuah pohon biner menggunakan rekursi.

## 📖 Tentang Program
- Menggunakan **class `TreeNode`** untuk representasi node pohon.
- Menggunakan **rekursi** dalam fungsi `lowestCommonAncestor` untuk menelusuri subtree kiri dan kanan.
- Base case:
  - Jika `root == null` → return null
  - Jika `root == p || root == q` → return root
- Hasil rekursi dari kiri dan kanan:
  - Jika keduanya ketemu, return root (sebagai LCA)
  - Jika salah satu ketemu, return yang ketemu

## 📊 Hasil Output
maka LCA dari 2 node p dan q / 4 , 5 adalah : 2
    1
  /   \
 2     3
/ \
4 5

## 📌 Alasan 1 File Saja
Karena program masih sederhana dan semua class dan fungsi saling berkaitan langsung, jadi lebih efisien diletakkan dalam satu file.

## 📌 Bahasa & Tools
- Java
- Text Editor: VS Code / IDE lain
- Compile: `javac Main.java`
- Run: `java Main`
