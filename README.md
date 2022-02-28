# -

## easy

## medium

### 리스트 정렬

```kotlin
        val list: MutableList<Rank> = ArrayList<Rank>()
        score.forEachIndexed{ index, i -> list.add(Rank(index, i)) }
        list.sortWith (Comparator{ a, b ->
            when {
                a.score == b.score -> a.index - b.index
                else -> b.score - a.score
            }
        })
```

### 2차원 배열 초기화

```kotlin
val reshapeMatrix: Array<IntArray> = Array(r) { i -> IntArray(c) { j -> 0 } }
```