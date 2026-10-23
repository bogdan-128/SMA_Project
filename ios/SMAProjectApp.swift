import SwiftUI

@main
struct SMAProjectApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}

struct ContentView: View {
    @State private var textColor: Color = .black

    var body: some View {
        Text("Hello World")
            .font(.system(size: 40))
            .foregroundStyle(textColor)
            .onTapGesture {
                textColor = Color(
                    red: .random(in: 0...1),
                    green: .random(in: 0...1),
                    blue: .random(in: 0...1)
                )
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .center)
    }
}
