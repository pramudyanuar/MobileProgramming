import 'package:flutter/material.dart';
import 'persegi_screen.dart';
import 'lingkaran_screen.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Hitung Luas & Keliling')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => const PersegiScreen()),
                );
              },
              child: const Text('Persegi'),
            ),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => const LingkaranScreen()),
                );
              },
              child: const Text('Lingkaran'),
            ),
          ],
        ),
      ),
    );
  }
}
