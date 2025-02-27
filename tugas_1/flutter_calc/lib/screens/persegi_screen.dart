import 'package:flutter/material.dart';

class PersegiScreen extends StatefulWidget {
  const PersegiScreen({super.key});

  @override
  State<PersegiScreen> createState() => _PersegiScreenState();
}

class _PersegiScreenState extends State<PersegiScreen> {
  final TextEditingController _controller = TextEditingController();
  double? luas;
  double? keliling;

  void hitung() {
    final double sisi = double.tryParse(_controller.text) ?? 0;
    setState(() {
      luas = sisi * sisi;
      keliling = 4 * sisi;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Persegi')),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            TextField(
              controller: _controller,
              keyboardType: TextInputType.number,
              decoration: const InputDecoration(
                labelText: 'Panjang Sisi',
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
