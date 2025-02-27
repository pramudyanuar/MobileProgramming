import 'package:flutter/material.dart';
import 'screens/home_screen.dart';

void main() {
  runApp(const HitungLuasApp());
}

class HitungLuasApp extends StatelessWidget {
  const HitungLuasApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Hitung Luas & Keliling',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const HomeScreen(),
    );
  }
}
