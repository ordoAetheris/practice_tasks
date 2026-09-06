package com.practice.task97_merkle_tree;

import java.util.List;

/**
 * MERKLE TREE — ВАРИАНТ B: PROOF + EDGE (§5)
 *
 * <p>CORE = базовый {@link MerkleTree} (корневой хэш из листьев).</p>
 * <p><b>ВАРИАНТ B [prim: null-edge ⭐]:</b> генерация и проверка Merkle-proof (путь хэшей до корня);
 * edge: нечётное число листьев (дублирование последнего), один лист, пустое дерево, изменённый лист рушит proof.</p>
 */
public class MerkleTreeB {
    public MerkleTreeB(List<byte[]> leaves){ throw new UnsupportedOperationException("TODO"); }
    public List<byte[]> proof(int leafIndex){ throw new UnsupportedOperationException("TODO: variant B — inclusion proof"); }
    public boolean verify(byte[] leaf, List<byte[]> proof, byte[] root){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== MerkleTreeB (§5 proof/edge): Smoke ==="); }
}
