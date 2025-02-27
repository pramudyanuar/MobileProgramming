import 'package:flutter/material.dart';

class LingkaranScreen extends StatefulWidget {
  const LingkaranScreen({super.key});

  @override
  State<LingkaranScreen> createState() => _LingkaranScreenState();
}

class _LingkaranScreenState extends State<LingkaranScreen> {
  final TextEditingController _controller = TextEditingController();
  double? luas;
  double? keliling;

  void hitung() {
    final double jariJari = double.tryParse(_controller.text) ?? 0;
    setState(() {
      luas = 3.14 * jariJari * jariJari;
      keliling = 2 * 3.14 * jariJari;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Lingkaran')),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            TextField(
              controller: _controller,
              keyboardType: TextInputType.number,
              decoration: const InputDecoration(
                labelText: 'Jari-jari',
                border: OutlineInputBorder(),
              ),
            ),
            const SizedBox(height: 10),
            ElevatedButton(onPressed: hitung, child: const Text('Hitung')),
            if (luas != null && keliling != null) ...[
              const SizedBox(height: 10),
              Text('Luas: $luas'),
              Text('Keliling: $keliling'),
            ],
          ],
        ),
      ),
    );
  }
}
