package com.practice.task85_merkle_tree;

import java.util.*;
import java.security.*;

/**
 * MERKLE TREE (ДЕРЕВО ХЕШЕЙ)
 *
 * <p>Реализовать дерево Меркла — структуру данных для эффективной и безопасной верификации
 * целостности данных. Используется в блокчейне (Bitcoin, Ethereum), Git, IPFS, системах
 * репликации (Cassandra anti-entropy repair).</p>
 *
 * <p>Принцип: листья — хеши отдельных блоков данных. Каждый родительский узел —
 * хеш конкатенации хешей своих потомков. Корневой хеш (root hash) является
 * криптографическим отпечатком всех данных.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>build(data) — построить дерево из списка блоков данных</li>
 *   <li>getRootHash() — получить корневой хеш (идентификатор всех данных)</li>
 *   <li>verify(data, index) — проверить целостность элемента по его audit proof</li>
 *   <li>getProof(index) — получить путь доказательства (audit trail) для элемента</li>
 *   <li>diff(otherTree) — найти различающиеся блоки между двумя деревьями</li>
 *   <li>update(index, newData) — обновить блок и пересчитать хеши на пути до корня</li>
 * </ul>
 *
 * <h3>Audit Proof (Merkle Proof):</h3>
 * <ul>
 *   <li>Для доказательства принадлежности листа дереву достаточно O(log n) хешей</li>
 *   <li>Proof = список пар (hash, direction), позволяющий вычислить root hash</li>
 *   <li>Верификатор может проверить целостность, не имея всех данных</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Хеш-функция: SHA-256 (через java.security.MessageDigest)</li>
 *   <li>Если число листьев нечётное — дублировать последний лист</li>
 *   <li>diff за O(n) в худшем случае, но O(k * log n) если различий мало</li>
 *   <li>update за O(log n) — пересчёт только на пути до корня</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task85_merkle_tree/MerkleTree.java
 * java -cp src/main/java com.practice.task85_merkle_tree.MerkleTree
 * </pre>
 */
public class MerkleTree {

    /**
     * Элемент доказательства (proof step): хеш соседнего узла и его позиция (LEFT/RIGHT).
     */
    public enum Direction { LEFT, RIGHT }

    /**
     * Шаг в Merkle Proof: хеш узла-соседа и направление (лево/право).
     */
    public record ProofStep(String hash, Direction direction) {}

    /**
     * Строит дерево Меркла из списка блоков данных.
     * Каждый блок хешируется SHA-256 для создания листа.
     * Если число блоков нечётное, последний дублируется.
     *
     * @param dataBlocks список блоков данных (не null, не пустой)
     * @throws IllegalArgumentException если список null или пустой
     */
    public MerkleTree(List<byte[]> dataBlocks) {
        // TODO: implement
    }

    /**
     * Возвращает корневой хеш дерева (hex string).
     *
     * @return корневой хеш в hex-представлении
     */
    public String getRootHash() {
        // TODO: implement
        return "";
    }

    /**
     * Получает Merkle Proof для элемента по индексу.
     * Proof содержит O(log n) шагов — хеши соседних узлов на пути от листа до корня.
     *
     * @param index индекс блока данных (0-based)
     * @return список шагов доказательства (от листа к корню)
     * @throws IndexOutOfBoundsException если индекс вне диапазона
     */
    public List<ProofStep> getProof(int index) {
        // TODO: implement
        return List.of();
    }

    /**
     * Верифицирует, что данные по указанному индексу принадлежат дереву
     * с данным корневым хешем, используя Merkle Proof.
     *
     * @param data     данные для верификации
     * @param index    индекс блока
     * @param proof    Merkle Proof (путь доказательства)
     * @param rootHash ожидаемый корневой хеш
     * @return true если данные валидны (proof приводит к rootHash)
     */
    public static boolean verify(byte[] data, int index, List<ProofStep> proof, String rootHash) {
        // TODO: implement
        return false;
    }

    /**
     * Находит индексы блоков, различающихся между этим деревом и другим.
     * Оптимизация: если хеши поддеревьев совпадают — поддерево не проверяется.
     *
     * @param other другое дерево Меркла
     * @return список индексов различающихся блоков
     */
    public List<Integer> diff(MerkleTree other) {
        // TODO: implement
        return List.of();
    }

    /**
     * Обновляет блок данных по индексу и пересчитывает хеши на пути до корня.
     * Сложность: O(log n).
     *
     * @param index   индекс блока
     * @param newData новые данные
     */
    public void update(int index, byte[] newData) {
        // TODO: implement
    }

    /**
     * Возвращает количество блоков данных (листьев).
     *
     * @return количество блоков
     */
    public int size() {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== MerkleTree: Smoke Test ===");
        // TODO: smoke test — построить дерево, получить root hash, сформировать proof,
        // верифицировать, изменить блок, сравнить деревья через diff
    }
}
