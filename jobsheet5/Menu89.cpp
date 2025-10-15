#include <iostream>
#include <string>
using namespace std;

int main() {
    int menu;
    string answer = "ya";

    while (answer == "ya") {
        // Tampilkan menu kopi
        cout << "##  Daftar Menu Kopi Ilkom  ##" << endl;
        cout << "==============================" << endl;
        cout << "1. Espresso" << endl;
        cout << "2. Cappuccino" << endl;
        cout << "3. Moccacino" << endl;
        cout << "4. Vanilla Latte" << endl;
        cout << "5. Hazelnut Latte" << endl;
        cout << endl;

        // Pilih menu
        cout << "Pilih pesanan anda (1-5): ";
        cin >> menu;
        cout << endl;

        switch (menu) {
            case 1:
                cout << "Pilihan anda: 1" << endl;
                cout << "Anda memilih Espresso" << endl;
                break;
            case 2:
                cout << "Pilihan anda: 2" << endl;
                cout << "Anda memilih Cappuccino" << endl;
                break;
            case 3:
                cout << "Pilihan anda: 3" << endl;
                cout << "Anda memilih Moccacino" << endl;
                break;
            case 4:
                cout << "Pilihan anda: 4" << endl;
                cout << "Anda memilih Vanilla Latte" << endl;
                break;
            case 5:
                cout << "Pilihan anda: 5" << endl;
                cout << "Anda memilih Hazelnut Latte" << endl;
                break;
            default:
                cout << "Menu tidak tersedia!" << endl;
        }

        cout << endl;
        cout << "Ingin memilih menu lain? (ya/tidak): ";
        cin >> answer;
        cout << endl;
    }

    cout << "Terima kasih telah memesan di Kopi Ilkom!" << endl;
    return 0;
}
