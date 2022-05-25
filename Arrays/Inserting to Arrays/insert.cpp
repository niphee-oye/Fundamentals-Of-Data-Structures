#include <iostream>
using namespace std;

int main(){
    int array[5];

    cout << " " << endl;
    for(int i = 0; i < 5; i++){
        cout << "Enter the element to be at index " << i << " : ";
        cin >> array[i];
    }cout << " " << endl;

    for(int i = 0; i < 5; i++){
        cout << "The element now at index " << i << " is " << array[i] << endl;
    }cout << " " << endl;
}