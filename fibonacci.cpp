#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Enter the number of terms for Fibonacci series: ";
    cin >> n;

    int fibonacci[n];

    fibonacci[0] = 0;
    fibonacci[1] = 1;

    for (int i = 2; i < n; ++i) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    cout << "Fibonacci series: ";
    for (int i = 0; i < n; ++i) {
        cout << fibonacci[i] << " ";
    }
    cout << endl;

    return 0;
}
