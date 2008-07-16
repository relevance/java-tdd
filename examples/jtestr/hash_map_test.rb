# from jtestr documentation
class HashMapTests < Test::Unit::TestCase
  def setup
    @map = java.util.HashMap.new
  end

  def test_that_map_is_empty
    assert @map.isEmpty
  end

  def test_that_an_entry_can_be_added
    @map.put "foo", "bar"
    assert_equal "bar", @map.get("foo")
  end

  def test_that_it_returns_a_keyset_that_returns_an_iterator_that_throws_exception
    assert_raises(java.util.NoSuchElementException) do
      @map.key_set.iterator.next
    end
  end
end