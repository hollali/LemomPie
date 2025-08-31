# 🍋 LemonPie

> A sleek, modern Android application with Firebase authentication and a beautiful dark-themed dashboard.

<div align="center">

![Android](https://img.shields.io/badge/Platform-Android-brightgreen?style=for-the-badge&logo=android)
![Firebase](https://img.shields.io/badge/Backend-Firebase-orange?style=for-the-badge&logo=firebase)
![Java](https://img.shields.io/badge/Language-Java-blue?style=for-the-badge&logo=java)
![Material Design](https://img.shields.io/badge/Design-Material-purple?style=for-the-badge&logo=material-design)

</div>

## ✨ Features

### 🔐 **Secure Authentication**
- Firebase Authentication integration
- Email/password login system
- Persistent user sessions
- Secure logout functionality

### 🎨 **Beautiful Dark Theme UI**
- Professional black and yellow color scheme
- Material Design components
- Card-based dashboard layout
- Smooth animations and transitions
- Responsive grid system

### 📱 **Modern Dashboard**
- Clean, intuitive navigation
- Quick action shortcuts
- Professional icon-based interface
- Scalable layout design
- Touch-optimized interactions

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:
- **Android Studio** (Arctic Fox or later)
- **Java Development Kit (JDK)** 8 or higher
- **Firebase account** for authentication services

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/hollali/lemonpie.git
   cd lemonpie
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned directory

3. **Firebase Setup**
   - Create a new Firebase project at [Firebase Console](https://console.firebase.google.com)
   - Add your Android app to the Firebase project
   - Download `google-services.json` and place it in `app/` directory
   - Enable Authentication in Firebase Console

4. **Build and Run**
   ```bash
   ./gradlew build
   ```

## 🎯 Project Structure

```
app/
├── src/main/
│   ├── java/com/example/lemonpie/
│   │   ├── DashboardActivity.java      # Main dashboard screen
│   │   ├── LoginActivity.java          # Authentication screen
│   │   └── MainActivity.java           # Entry point
│   ├── res/
│   │   ├── layout/
│   │   │   ├── dashboard_activity.xml  # Dashboard UI layout
│   │   │   └── login_activity.xml      # Login UI layout
│   │   ├── values/
│   │   │   ├── colors.xml              # Color definitions
│   │   │   └── strings.xml             # String resources
│   │   └── drawable/                   # Icons and graphics
│   └── AndroidManifest.xml
```

## 🎨 Design System

### Color Palette
- **Primary Black**: `#FF000000` - Main background
- **Secondary Black**: `#0B192C` - Card backgrounds  
- **Accent Yellow**: `#F3C623` - Icons, text, and highlights
- **Blue Accent**: `#33A1E0` - Secondary actions
- **Dark Blue**: `#213448` - Text variations

### Typography
- **Headers**: Bold, 20-24sp
- **Body Text**: Regular, 14-16sp
- **Captions**: Regular, 12-14sp

## 🔧 Configuration

### Required Dependencies

Add these to your `app/build.gradle`:

```gradle
dependencies {
    implementation 'com.google.firebase:firebase-auth:22.3.0'
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'com.google.firebase:firebase-bom:32.5.0'
}
```

### Required Resources

Create these drawable icons in `res/drawable/`:
- `logout.xml` - Logout icon
- `ic_graph.xml` - Analytics icon
- `ic_settings.xml` - Settings icon
- `ic_report.xml` - Reports icon
- `ic_profile.xml` - Profile icon
- `ic_add.xml` - Add action icon
- `ic_search.xml` - Search icon

## 📱 Screenshots

*Coming soon - Add your app screenshots here*

## 🛠️ Built With

- **[Android SDK](https://developer.android.com)** - Mobile development framework
- **[Firebase Authentication](https://firebase.google.com/products/auth)** - User authentication
- **[Material Design Components](https://material.io/develop/android)** - UI components
- **[ConstraintLayout](https://developer.android.com/training/constraint-layout)** - Flexible layouts
- **[CardView](https://developer.android.com/guide/topics/ui/layout/cardview)** - Card-based UI elements

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Code Style Guidelines
- Follow Android development best practices
- Use meaningful variable and method names
- Add comments for complex logic
- Maintain consistent indentation (4 spaces)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- **Your Name** - *Initial work* - [YourGitHub](https://github.com/hollali)

## 🙏 Acknowledgments

- Material Design team for the beautiful design system
- Firebase team for seamless authentication services
- Android development community for inspiration and support

## 📞 Support

If you have any questions or need help getting started:

- 📧 Email: dheztinykartel@gmail.com.com
- 🐛 Issues: [GitHub Issues](https://github.com/hollali/lemonpie/issues)
- 💬 Discussions: [GitHub Discussions](https://github.com/hollali/lemonpie/discussions)

---

<div align="center">

**Made with ❤️ and lots of ☕**

*Star ⭐ this repository if you found it helpful!*

</div>
